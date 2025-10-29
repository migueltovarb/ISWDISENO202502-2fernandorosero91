import java.util.Scanner;
import PaqueteAuthor.Author;
import PaqueteBook.Book;

public class programaBook {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el nombre del autor:");
		String authorName = scanner.nextLine();

		System.out.println("Ingrese el email del autor:");
		String authorEmail = scanner.nextLine();

		System.out.println("Ingrese el género del autor (m/f):");
		char authorGender = scanner.next().charAt(0);
		scanner.nextLine(); // limpiar buffer

		Author author = new Author(authorName, authorEmail, authorGender);

		System.out.println("Ingrese el nombre del libro:");
		String bookName = scanner.nextLine();

		System.out.println("Ingrese el precio del libro:");
		double bookPrice = scanner.nextDouble();

		System.out.println("Ingrese la cantidad en stock:");
		int bookQty = scanner.nextInt();

		Book book = new Book(bookName, author, bookPrice, bookQty);

		System.out.println("\n📘 Información del libro:");
		System.out.println(book);

		scanner.close();
	}
}