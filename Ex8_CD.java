package Ex8;

public class Ex8_CD {
	private int id;
	private String name;
	private int numberofSong;
	private double price;
	
	
	
	public Ex8_CD() {
		super();
	}



	public Ex8_CD(int id, String name, int numberofSong, double price) {
		super();
		setId(id);
		setName(name);
		setNumberofSong(numberofSong);
		setPrice(price);
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		if(id < 0 && id > 999999) {
			System.out.println("Error: Wrong ID");
		}else {
			this.id = id;
		}
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		if(name == null) {
			this.name="chưa xác định";
		}else {
			this.name = name;
		}
	}



	public int getNumberofSong() {
		return numberofSong;
	}



	public void setNumberofSong(int numberofSong) {
		if(numberofSong < 0) {
			System.out.println("Error: Wrong number of song");
		}else {
			this.numberofSong = numberofSong;
		}
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		if(price < 0) {
			System.out.println("Error: Wrong price");
		}else {
			this.price = price;
		}
	}

	public void showCD(){
        System.out.printf("%-10d %-20s%-10d %-20.1f \n",id,name,numberofSong,price);
    }

	@Override
	public String toString() {
		return "Ex8_CD [id=" + id + ", name=" + name + ", numberofSong=" + numberofSong + ", price=" + price + "]";
	}
	
	
}
