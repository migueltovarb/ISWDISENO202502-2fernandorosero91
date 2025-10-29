package PaqueteAccount;

import java.util.Scanner;

public class ProgramaAccount {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el ID de la cuenta:");
		String id = scanner.nextLine();

		System.out.println("Ingrese el nombre del titular:");
		String name = scanner.nextLine();

		System.out.println("Ingrese el balance inicial:");
		int balance = scanner.nextInt();

		Account cuenta1 = new Account(id, name, balance);

		System.out.println(cuenta1);

		System.out.println("Ingrese monto a acreditar:");
		int credito = scanner.nextInt();
		cuenta1.credit(credito);
		System.out.println("Balance actualizado: " + cuenta1.getBalance());

		System.out.println("Ingrese monto a debitar:");
		int debito = scanner.nextInt();
		cuenta1.debit(debito);
		System.out.println("Balance actualizado: " + cuenta1.getBalance());

		// Crear segunda cuenta para transferencia
		Account cuenta2 = new Account("C002", "CuentaDestino", 500);
		System.out.println("Cuenta destino antes de la transferencia: " + cuenta2);

		System.out.println("Ingrese monto a transferir a la cuenta destino:");
		int transferencia = scanner.nextInt();
		cuenta1.transferTo(cuenta2, transferencia);

		System.out.println("Cuenta origen después de la transferencia: " + cuenta1);
		System.out.println("Cuenta destino después de la transferencia: " + cuenta2);

		scanner.close();
	}
}