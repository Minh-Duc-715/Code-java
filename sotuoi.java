package baitrenlop;

import java.util.Scanner;
public class sotuoi {
	public static void main(String[] args) {
		int tuoi,namSinh ;	
		String name, thuocNhom;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên của bạn: ");
		name = scanner.nextLine();
		System.out.println(" Nhập năm sinh của bạn: ");
	    namSinh = scanner.nextInt();
		
	    tuoi = 2021 - namSinh; //2021 la nam hien tai
	    if(tuoi < 16) {
	    	thuocNhom = " ở độ tuổi thành niên .";
	    } if (tuoi >= 16 & tuoi <=18) {
	    	thuocNhom =" ở độ tuổi trưởng thành.";
	    } else {
	    	thuocNhom =" đã già .";
	    }
		System.out.println("Bạn " +  name  + thuocNhom);
	}

}
