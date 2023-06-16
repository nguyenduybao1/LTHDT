package Ex7;

public class Ex7_Circle {
	private Ex7_Coordinates tam;
	private double banKinh;
	private final double pi = 3.14;
	
	public Ex7_Circle() {
		super();
	}

	

	public Ex7_Circle(Ex7_Coordinates tam, double banKinh) {
		super();
		this.tam = tam;
		this.banKinh = banKinh;
	}



	public Ex7_Coordinates getTam() {
		return tam;
	}



	public void setTam(Ex7_Coordinates tam) {
		this.tam = tam;
	}



	public double getBanKinh() {
		return banKinh;
	}



	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}



	public double getPi() {
		return pi;
	}



	public double tinhChuVi() {
		return banKinh * 2 * pi;
	}
	public double tinhDienTich() {
		return pi*(banKinh*banKinh);
	}
}
