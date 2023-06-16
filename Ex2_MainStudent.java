package Ex2;

public class Ex2_MainStudent {
	public static void main(String[] args) {
		Ex2_Student student = new Ex2_Student(-1, "Bao", 9, 10);
		Ex2_Student student2 = new Ex2_Student(2, "Thinh", 10, 10);
	
		System.out.println(student);
		System.out.println("sv1: "+ student.CalAve());
		System.out.println(student2);
		System.out.println("sv2: "+ student2.CalAve());
		
	}
}
