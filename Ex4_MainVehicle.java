package Ex4;

public class Ex4_MainVehicle {
	public static void main(String[] args) {
		Ex4_Vehicle vehicle1 = new Ex4_Vehicle("Thinh", "Audi", 8000, 256);
		Ex4_Vehicle vehicle2 = new Ex4_Vehicle("Bao", "Toyota", 1000, 167);
		Ex4_Vehicle vehicle3 = new Ex4_Vehicle("Minh", "Ford", 2000, 202);

		
		vehicle1.tinhThue();
		vehicle2.tinhThue();
		vehicle3.tinhThue();
		
		
		
		System.out.printf("%5s %20s %10s %8s \n","Chủ xe","Dung tích","Trị giá","Thuế");
        vehicle1.inBang();
        vehicle2.inBang();
        vehicle3.inBang();
	}
}
