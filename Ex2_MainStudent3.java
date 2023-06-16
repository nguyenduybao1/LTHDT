package Ex2;

import java.util.Scanner;

public class Ex2_MainStudent3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ex2_Student student = new Ex2_Student(-1, "Bao", 9, 10);
		Ex2_Student student2 = new Ex2_Student(2, "Thinh", 10, 10);
		
		
		System.out.println("---Thông tin sinh viên 3---");
		Ex2_Student student3 = new Ex2_Student();
		System.out.println("Nhập mssv:");
		student3.setMssv(sc.nextInt()); 
		sc.nextLine();
		System.out.println("Nhập tên:");
		student3.setName(sc.nextLine()); 
		System.out.println("Nhập điểm thực hành:");
		student3.setGradeTH(sc.nextDouble()); 
		System.out.println("Nhập điểm lý thuyết:");
		student3.setGradeLT(sc.nextDouble());
		
		System.out.println(student3);
	}
	
	
}
