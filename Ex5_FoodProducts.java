package Ex5;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ex5_FoodProducts {
	private int maHang;
	private String tenHang;
	private double donGia;
	private Date nsx;
	private Date nhh;
	
	
	public Ex5_FoodProducts() {
		super();
	}

	public Ex5_FoodProducts(int maHang, String tenHang, double donGia, Date nsx, Date nhh) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.nsx = nsx;
		this.nhh = nhh;
	}
	
	

	public Ex5_FoodProducts(int maHang, String tenHang, double donGia) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
	}

	public int getMaHang() {
		return maHang;
	}

	public void setMaHang(int maHang) {
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public Date getNsx() {
		return nsx;
	}

	public void setNsx(Date nsx) {
		this.nsx = nsx;
	}

	public Date getNhh() {
		return nhh;
	}

	public void setNhh(Date nhh) {
			this.nhh = nhh;		
	}
	
	
   
 


 
    @Override
	public String toString() {
    	 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
         String str1 = simpleDateFormat.format(nsx);
         String str2 = simpleDateFormat.format(nhh);
		
	
		return "HangThucPham [maHang=" + maHang + ", tenHang=" + tenHang + ", donGia=" + donGia + ", nsx=" + str1
				+ ", nhh=" + str2 + "]";
	}

 
    public boolean checkDay(boolean t) {
        if (this.getNsx().compareTo(this.getNhh()) < 0) {
            t = false;
        } else {
            System.out.println("Ngày hết hạn không được nhỏ hơn ngày sản xuất : ");
        }
        return t;
    }
 
    public void checkExpery() {
        Date today = new Date();
        today.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String st = simpleDateFormat.format(today);
        if (this.getNhh().compareTo(today) < 0) {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa đã hết hạn ");
        } else {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa vẫn còn hạn ");
        }
    }
}
