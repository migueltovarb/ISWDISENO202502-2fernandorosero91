package PaqueteInvoiceItem;

import java.util.Scanner;

public class ProgramaInvoiceItem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el ID del artículo:");
		String id = scanner.nextLine();

		System.out.println("Ingrese la descripción del artículo:");
		String desc = scanner.nextLine();

		System.out.println("Ingrese la cantidad:");
		int qty = scanner.nextInt();

		System.out.println("Ingrese el precio unitario:");
		double unitPrice = scanner.nextDouble();

		InvoiceItem item = new InvoiceItem(id, desc, qty, unitPrice);

		System.out.println(item);

		System.out.println("Precio total: $" + item.getTotal());

		System.out.println("Actualizar cantidad:");
		int newQty = scanner.nextInt();
		item.setQty(newQty);

		System.out.println("Actualizar precio unitario:");
		double newPrice = scanner.nextDouble();
		item.setUnitPrice(newPrice);

		System.out.println("Artículo actualizado: " + item);
		System.out.println("Nuevo total: $" + item.getTotal());

		scanner.close();
	}
}
