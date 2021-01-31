package baitrenlop;

import java.util.Scanner;

public class tinhtong {
	
	public static void main(String[] args) {
		
		int tong = 0, numbers ;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Nhap vao so: ");
			numbers = scanner.nextInt();
			tong += numbers;
			if (tong > 100)
				break;
		} while (numbers > 0);
		System.out.println("tong cac chu so da nhap la =  " + tong);
	}

}

