package baitrenlop;

import java.util.Scanner;

public class giaithua {
	public static void main(String[] args) {
		int n,temp =1;
		long giaiThua = 1;
		
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Nhập vào một số nguyên: ");
			n = scanner.nextInt();
		}while ((n <= 0) || (n > 10));
		
		while (temp <= n ) {
			giaiThua *= temp;
			temp++;
		}
		System.out.println(n + "! = " + giaiThua );
	}
}
