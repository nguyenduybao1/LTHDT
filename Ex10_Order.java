package Ex10;

import java.time.LocalDate;

public class Ex10_Order {
	private int id;
	private LocalDate orderDate;
	private Ex10_OrderDetail lineItems;
	private int count;
	
	
	
	public Ex10_Order() {
		super();
	}

	

	public Ex10_Order(int id, LocalDate orderDate, Ex10_OrderDetail lineItems, int count) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.lineItems = lineItems;
		this.count = count;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public LocalDate getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}



	public Ex10_OrderDetail getLineItems() {
		return lineItems;
	}



	public void setLineItems(Ex10_OrderDetail lineItems) {
		this.lineItems = lineItems;
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}
//	public void addLineItem(Product p, int x) {
//		lineItems
//	}
	
}
