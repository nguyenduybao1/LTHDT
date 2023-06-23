package Ex9;

public class Ex9_MainWorker {
	public static void main(String[] args) {
		Ex9_Worker worker1 = new Ex9_Worker(1, "Nguyen", "Bao", 100);
		Ex9_Worker worker2 = new Ex9_Worker(2, "Tang", "Ngan", 300);
		Ex9_Worker worker3 = new Ex9_Worker(3, "Nguyen", "Thinh", 500);
		Ex9_Worker worker4 = new Ex9_Worker(4, "Chau", "Tan", 700);
		
		System.out.println(worker1);
		System.out.println(worker1.calSalary());
		System.out.println(worker2);
		System.out.println(worker2.calSalary());
		System.out.println(worker3);
		System.out.println(worker3.calSalary());
		System.out.println(worker4);
		System.out.println(worker4.calSalary());
	}
}
