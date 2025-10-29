package PaqueteAccount;

public class Account {

	private String id;
	private String name;
	private int balance;

	// Constructor con balance inicial en 0
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
		this.balance = 0;
	}

	// Constructor con balance definido
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	// Getters
	public String getID() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getBalance() {
		return this.balance;
	}

	// Método para acreditar dinero
	public int credit(int amount) {
		this.balance += amount;
		return this.balance;
	}

	// Método para debitar dinero
	public int debit(int amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
		} else {
			System.out.println("Monto excede el balance disponible.");
		}
		return this.balance;
	}

	// Método para transferir dinero a otra cuenta
	public int transferTo(Account another, int amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
			another.credit(amount);
		} else {
			System.out.println("Monto excede el balance disponible.");
		}
		return this.balance;
	}

	@Override
	public String toString() {
		return "Account{id=" + id + ", name=" + name + ", balance=" + balance + "}";
	}
}