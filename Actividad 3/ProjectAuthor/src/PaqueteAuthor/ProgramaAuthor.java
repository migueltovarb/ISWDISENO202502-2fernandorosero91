package PaqueteAuthor;

import java.util.Scanner;


public class ProgramaAuthor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el nombre del autor:");
		String name = scanner.nextLine();

		System.out.println("Ingrese el email del autor:");
		String email = scanner.nextLine();

		System.out.println("Ingrese el género del autor (m/f):");
		char gender = scanner.next().charAt(0);

		Author author = new Author(name, email, gender);

		System.out.println("Información del autor:");
		System.out.println(author);

		System.out.println("¿Desea actualizar el email? (s/n):");
		char opcion = scanner.next().charAt(0);
		scanner.nextLine(); // limpiar buffer

		if (opcion == 's' || opcion == 'S') {
			System.out.println("Ingrese el nuevo email:");
			String nuevoEmail = scanner.nextLine();
			author.setEmail(nuevoEmail);
			System.out.println("Email actualizado:");
			System.out.println(author);
		}

		scanner.close();
	}
}