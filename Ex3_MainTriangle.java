package Ex3;

public class Ex3_MainTriangle {
	public static void main(String[] args) {
		Ex3_Triangle triangle = new Ex3_Triangle(2, 3, 4);
		
		System.out.println(triangle);
		System.out.println("Chu vi:" + triangle.perimeterTriangle());
		System.out.println("Dien tich: " + triangle.acreageTriangle());
		
		triangle.checkTriangle();;
		
		Ex3_Triangle triangle2 = new Ex3_Triangle(2, 2, 2);
		
		System.out.println(triangle2);
		System.out.println("Chu vi:" + triangle2.perimeterTriangle());
		System.out.println("Dien tich: " + triangle2.acreageTriangle());
		
		triangle2.checkTriangle();
	}
}
