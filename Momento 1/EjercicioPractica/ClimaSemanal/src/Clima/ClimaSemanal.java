package Clima;

import java.util.Scanner;

public class ClimaSemanal {

    public static final double TEMP_ALTA = 30.0;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char repetir;

        do {
            double[] temperaturas = new double[7];
            double suma = 0;
            double max = Double.MIN_VALUE;
            double min = Double.MAX_VALUE;
            int diasAltos = 0;

            System.out.println("\n===== REGISTRO DE TEMPERATURAS SEMANALES =====");

            for (int i = 0; i < 7; i++) {
                System.out.print("Ingrese la temperatura del día " + nombreDia(i + 1) + ": ");
                temperaturas[i] = entrada.nextDouble();

                suma += temperaturas[i];
                if (temperaturas[i] > max) max = temperaturas[i];
                if (temperaturas[i] < min) min = temperaturas[i];
                if (temperaturas[i] > TEMP_ALTA) diasAltos++;
            }

            double promedio = suma / 7;

            System.out.println("\n===== RESULTADOS SEMANALES =====");
            System.out.printf("Temperatura promedio: %.2f°C%n", promedio);
            System.out.println("Temperatura máxima: " + max + "°C");
            System.out.println("Temperatura mínima: " + min + "°C");
            System.out.println("Días con temperatura superior a " + TEMP_ALTA + "°C: " + diasAltos);

            System.out.println("\n===== MENSAJE POR DÍA =====");
            for (int i = 0; i < 7; i++) {
                mostrarMensajeDia(i + 1, temperaturas[i]);
            }

            System.out.print("\n¿Desea procesar otra semana? (S/N): ");
            repetir = entrada.next().toUpperCase().charAt(0);

        } while (repetir == 'S');

        System.out.println("Gracias por usar el sistema de estadísticas climáticas.");
        entrada.close();
    }

    public static String nombreDia(int dia) {
        switch (dia) {
            case 1: return "Lunes";
            case 2: return "Martes";
            case 3: return "Miércoles";
            case 4: return "Jueves";
            case 5: return "Viernes";
            case 6: return "Sábado";
            case 7: return "Domingo";
            default: return "Día inválido";
        }
    }

    public static void mostrarMensajeDia(int dia, double temperatura) {
        switch (dia) {
            case 1:
                System.out.println("Lunes: temperatura de " + temperatura + "°C. Inicio de semana.");
                break;
            case 2:
                System.out.println("Martes: temperatura de " + temperatura + "°C. Día estable.");
                break;
            case 3:
                System.out.println("Miércoles: temperatura de " + temperatura + "°C. Mitad de semana.");
                break;
            case 4:
                System.out.println("Jueves: temperatura de " + temperatura + "°C. Cerca del fin de semana.");
                break;
            case 5:
                System.out.println("Viernes: temperatura de " + temperatura + "°C. Último día laboral.");
                break;
            case 6:
                System.out.println("Sábado: temperatura de " + temperatura + "°C. Día de descanso.");
                break;
            case 7:
                System.out.println("Domingo: temperatura de " + temperatura + "°C. Cierre de semana.");
                break;
            default:
                System.out.println("Día inválido.");
        }
    }
}
