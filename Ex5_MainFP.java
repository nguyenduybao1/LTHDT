package Ex5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Ex5_MainFP {
	public static void main(String[] args){
		
		Ex5_FoodProducts hangThucPham = new Ex5_FoodProducts(1, "Gao", 100000, new Date(118,2,7), new Date(119,2,7));
		
		System.out.println(hangThucPham.toString());
		
		hangThucPham.checkExpery();
	}
}
