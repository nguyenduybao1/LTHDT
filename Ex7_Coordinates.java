package Ex7;

public class Ex7_Coordinates {
	private String ten;
	private float x;
	private float y;
	
	
	public Ex7_Coordinates() {
		super();
	}


	public Ex7_Coordinates(String ten, float x, float y) {
		super();
		this.ten = ten;
		this.x = x;
		this.y = y;
	}


	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	public float getX() {
		return x;
	}


	public void setX(float x) {
		this.x = x;
	}


	public float getY() {
		return y;
	}


	public void setY(float y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return "Coordinates [ten=" + ten + ", x=" + x + ", y=" + y + "]";
	}


	
	
	
	
}
