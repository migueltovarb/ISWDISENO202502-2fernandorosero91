package Persona;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = entrada.nextInt();

        System.out.print("Ingrese sexo (H/M): ");
        char sexo = entrada.next().charAt(0);

        System.out.print("Ingrese peso (kg): ");
        double peso = entrada.nextDouble();

        System.out.print("Ingrese altura (m): ");
        double altura = entrada.nextDouble();

        Persona p1 = new Persona(nombre, edad, "", sexo, peso, altura);
        Persona p2 = new Persona(nombre, edad, sexo);
        Persona p3 = new Persona();

        p3.setNombre("Carlos");
        p3.setEdad(30);
        p3.setSexo('H');
        p3.setPeso(80);
        p3.setAltura(1.75);

        System.out.println("\n===== RESULTADOS =====");
        mostrarResultados(p1);
        mostrarResultados(p2);
        mostrarResultados(p3);

        entrada.close();
    }

    public static void mostrarResultados(Persona persona) {
        int imc = persona.calcularIMC();
        switch (imc) {
            case -1:
                System.out.println(persona.getNombre() + " está por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println(persona.getNombre() + " está en su peso ideal.");
                break;
            case 1:
                System.out.println(persona.getNombre() + " tiene sobrepeso.");
                break;
        }

        if (persona.esMayorDeEdad()) {
            System.out.println(persona.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(persona.getNombre() + " es menor de edad.");
        }

        System.out.println(persona.toString());
        System.out.println("--------------------------");
    }
}
