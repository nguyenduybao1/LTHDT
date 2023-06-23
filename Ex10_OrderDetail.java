package Ex10;

public class Ex10_OrderDetail {
	private int quantity;
	private Ex10_Product product;

	
	public Ex10_OrderDetail() {
		super();
	}
	
	public Ex10_OrderDetail(int quantity, Ex10_Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Ex10_Product getProduct() {
		return product;
	}

	public void setProduct(Ex10_Product product) {
		this.product = product;
	}

	
	@Override
	public String toString() {
		return "OrderDetail [quantity=" + quantity + ", product=" + product + "]";
	}
	
//	public double calcTotalPrice() {
//
//		return quantity * price;
//		
//	}
	
	
	
}
