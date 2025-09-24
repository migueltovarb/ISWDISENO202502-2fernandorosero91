package PaqueteInvoiceItem;

public class InvoiceItem {

	private String id;
	private String desc;
	private int qty;
	private double unitPrice;

	// Constructor
	public InvoiceItem(String id, String desc, int qty, double unitPrice) {
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}

	// Getters
	public String getID() {
		return this.id;
	}

	public String getDesc() {
		return this.desc;
	}

	public int getQty() {
		return this.qty;
	}

	public double getUnitPrice() {
		return this.unitPrice;
	}

	// Setters
	public void setQty(int qty) {
		this.qty = qty;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	// Total price
	public double getTotal() {
		return this.unitPrice * this.qty;
	}

	@Override
	public String toString() {
		return "InvoiceItem[id=" + id + ", desc=" + desc + ", qty=" + qty + ", Precio Unitario=" + unitPrice + "]";
	}
}