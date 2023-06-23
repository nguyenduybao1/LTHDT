package Ex9;

public class Ex9_MainWorker {
	public static void main(String[] args) {
		Ex9_Worker congNhan1 = new Ex9_Worker(1, "Nguyen", "Thinh", 100);
		Ex9_Worker congNhan2 = new Ex9_Worker(2, "Tran", "Thuy", 300);
		Ex9_Worker congNhan3 = new Ex9_Worker(3, "Nguyen", "Bao", 500);
		Ex9_Worker congNhan4 = new Ex9_Worker(4, "Nguyen", "Dien", 700);
		
		System.out.println(congNhan1);
		System.out.println(congNhan1.tinhLuong());
		System.out.println(congNhan2);
		System.out.println(congNhan2.tinhLuong());
		System.out.println(congNhan3);
		System.out.println(congNhan3.tinhLuong());
		System.out.println(congNhan4);
		System.out.println(congNhan4.tinhLuong());
	}
}
