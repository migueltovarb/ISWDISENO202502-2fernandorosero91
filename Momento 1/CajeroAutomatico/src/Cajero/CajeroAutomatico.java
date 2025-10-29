package Cajero;

import java.util.Scanner;

public class CajeroAutomatico {

    public static final double SALDO_INICIAL = 1000.0;

    public static void main(String[] args) {

        double saldo = SALDO_INICIAL;
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== CAJERO AUTOMÁTICO =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: $" + saldo);
                    break;

                case 2:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = entrada.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito exitoso. Su nuevo saldo es: $" + saldo);
                    } else {
                        System.out.println("Cantidad inválida. Debe ser mayor que cero.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = entrada.nextDouble();
                    if (retiro > 0) {
                        if (retiro <= saldo) {
                            saldo -= retiro;
                            System.out.println("Retiro exitoso. Su nuevo saldo es: $" + saldo);
                        } else {
                            System.out.println("Error: saldo insuficiente.");
                        }
                    } else {
                        System.out.println("Cantidad inválida. Debe ser mayor que cero.");
                    }
                    break;

                case 4:
                    System.out.println("Gracias por usar el cajero. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 4);

        entrada.close();
    }
}
