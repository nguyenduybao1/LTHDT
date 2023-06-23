package Ex10;

public class Ex10_Product {
	private String description;
	private String id;
	private double price;
	
	
	public Ex10_Product() {
		super();
	}


	public Ex10_Product(String description, String id, double price) {
		super();
		this.description = description;
		this.id = id;
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [description=" + description + ", id=" + id + ", price=" + price + "]";
	}
	
	
	
}
