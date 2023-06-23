package Ex9;

public class Ex9_Worker {
	private int id;
	private String firstName;
	private String lastName;
	private int productID;
	
	
	public Ex9_Worker() {

	}



	public Ex9_Worker(int id, String firstName, String lastName, int productID) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.productID = productID;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public int getProductID() {
		return productID;
	}



	public void setProductID(int productID) {
		this.productID = productID;
	}



	public double calSalary() {
		double salary;
		
		if(productID >0 && productID <= 199) {
			 salary = 0.5 * productID;
		}else if(productID <=399) {
			salary = 0.55 * productID;
		}else if(productID <=599) {
			salary = 0.6 * productID;
		}else {
			salary = 0.65 * productID;
		}
		return salary;
	}
	
	public void hienThiCongNhan() {
		System.out.printf(" %-10d %-10s %-10s %-10d \n", id, firstName, lastName, productID);
	}



	@Override
	public String toString() {
		return "Ex9_Worker [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", productID="
				+ productID + "]";
	}

	
	
	
}
