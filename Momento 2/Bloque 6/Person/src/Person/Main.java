package Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> personas = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Crear Persona");
            System.out.println("2. Crear Estudiante");
            System.out.println("3. Crear Empleado (Staff)");
            System.out.println("4. Mostrar todas las personas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombreP = sc.nextLine();
                    System.out.print("Ingrese la dirección: ");
                    String direccionP = sc.nextLine();
                    personas.add(new Person(nombreP, direccionP));
                    System.out.println("Persona registrada correctamente.");
                    break;

                case 2:
                    System.out.print("Ingrese el nombre: ");
                    String nombreS = sc.nextLine();
                    System.out.print("Ingrese la dirección: ");
                    String direccionS = sc.nextLine();
                    System.out.print("Ingrese el programa: ");
                    String programa = sc.nextLine();
                    System.out.print("Ingrese el año: ");
                    int year = sc.nextInt();
                    System.out.print("Ingrese el valor de la matrícula: ");
                    double fee = sc.nextDouble();
                    personas.add(new Student(nombreS, direccionS, programa, year, fee));
                    System.out.println("Estudiante registrado correctamente.");
                    break;

                case 3:
                    System.out.print("Ingrese el nombre: ");
                    String nombreSt = sc.nextLine();
                    System.out.print("Ingrese la dirección: ");
                    String direccionSt = sc.nextLine();
                    System.out.print("Ingrese el colegio o institución: ");
                    String escuela = sc.nextLine();
                    System.out.print("Ingrese el salario: ");
                    double salario = sc.nextDouble();
                    personas.add(new Staff(nombreSt, direccionSt, escuela, salario));
                    System.out.println("Empleado registrado correctamente.");
                    break;

                case 4:
                    System.out.println("\n===== LISTA DE PERSONAS REGISTRADAS =====");
                    if (personas.isEmpty()) {
                        System.out.println("No hay registros disponibles.");
                    } else {
                        for (Person p : personas) {
                            System.out.println(p.toString());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);

        sc.close();
    }
}
