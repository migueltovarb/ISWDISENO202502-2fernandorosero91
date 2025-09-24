package PaqueteEmployee;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Employee myEmployee = new Employee(0, "", "", 0);

		System.out.println(myEmployee);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese ID empleado:");
		int id = scanner.nextInt();

		System.out.println("Ingrese primer nombre:");
		String firstName = scanner.next();

		System.out.println("Ingrese apellido:");
		String lastName = scanner.next();

		System.out.println("Ingrese salario mensual:");
		int salary = scanner.nextInt();

		myEmployee.setId(id);
		myEmployee.setFirstName(firstName);
		myEmployee.setLastName(lastName);
		myEmployee.setSalary(salary);

		System.out.println(myEmployee);

		System.out.println("El salario anual es: " + myEmployee.getAnnualSalary());

		System.out.println("Ingrese porcentaje:");
		int percent = scanner.nextInt();

		int newSalary = myEmployee.raiseSalary(percent);

		System.out.println("Nuevo salario despues del aumento: " + newSalary);

		System.out.println("Estado del empleado:");
		System.out.println(myEmployee);

		scanner.close();
	}
}