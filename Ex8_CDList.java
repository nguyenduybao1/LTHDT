package Ex8;

import java.util.Scanner;

public class Ex8_CDList {
	static Scanner sc = new Scanner(System.in);
	public static void ImportCD(Ex8_CD cd) {
		System.out.print("Nhập mã CD: ");
        cd.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập tên CD : ");
        cd.setName(sc.nextLine());
        System.out.print("Nhập số bài hát : ");
        cd.setNumberofSong(sc.nextInt());
        System.out.print("Nhập giá thành : ");
        cd.setPrice(sc.nextFloat());
	}
	
	
	public static void main(String[] args) {
		Ex8_CD cd[] = null;
		int a, n =0;
		boolean flag = true;
		
		do {
            System.out.println("Lựa chọn của bạn là gì?");
            System.out.println( "1.Nhập thông tin CD \n" +
                    			"2.Tính tổng số lượng CD \n" +
                    			"3.Tính tổng giá thành \n" + 
                    			"4.Xuất danh sách Album.\n" + 
                    			"5.Sắp xếp giảm dần theo giá thành\n"+
                    			"6.Sắp xếp tăng dần theo tựa CD\n"+
                    			"7.Exit");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Nhập số lượng CD : ");
                    n = sc.nextInt();
                    cd = new Ex8_CD[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("CD thứ " + (i + 1)+": ");
                        cd[i] = new Ex8_CD();
                        ImportCD(cd[i]);
                      }
                    break;
                case 2:
                    System.out.println("Tổng số lượng CD là : " + n);
                    break;
                case 3:
                    int tong = 0;
                    for (int i = 0; i < n; i++) {
                        tong += cd[i].getPrice();
                    }
                    System.out.println("" +
                            "Tổng giá thành là : " + tong);
                    break;
                case 4:
                    System.out.printf("%-10s %-20s %-10s %-20s \n", "Mã CD", "Tên CD", "Số bài hát", "Giá thành");
                    for (int i = 0; i < n; i++) {
                        cd[i].showCD();
                    }
                    break;
                case 5:
                	Ex8_CD temp = cd[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (cd[i].getPrice() < cd[j].getPrice()) {
                                temp = cd[j];
                                cd[j] = cd[i];
                                cd[i] = temp;
                            }
                        }
                    }
                    System.out.println("Sắp xếp thành công, Chọn lựa chọn 4 để kiểm tra!");
                    break;
                case 6:
                    temp = cd[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (cd[i].getName().compareTo(cd[j].getName())>0) {
                                temp = cd[j];
                                cd[j] = cd[i];
                                cd[i] = temp;
                            }
                        }
                    }
                    System.out.println("Sắp xếp thành công, Chọn lựa chọn 4 để kiểm tra!");
                    break;
                default:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
            }
        }while (flag) ;
    }
	
}

