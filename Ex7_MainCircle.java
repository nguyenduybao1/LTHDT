package Ex7;

public class Ex7_MainCircle {
	public static void main(String[] args) {
		//Yêu cầu: xuất kết quả tương ứng là:"Hình tròn có tâm O(5,5) với bán kính 10.5, có diện tích và chu vi lần lượt là 346.185 và 65.940
		Ex7_Coordinates coordinates = new Ex7_Coordinates("O", 5, 5);
		Ex7_Circle circle = new Ex7_Circle(coordinates, 10.5);
		
		System.out.println(coordinates);
		
		System.out.println(circle.tinhChuVi());
		System.out.println( circle.tinhDienTich());
	}
}
