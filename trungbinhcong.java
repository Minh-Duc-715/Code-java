package baitrenlop;

import java.util.Scanner;

public class trungbinhcong {
	public static void main(String[] args) {
        int n, tong = 0, number;
        float avgNumber;
       
        Scanner scanner = new Scanner(System.in);      
        System.out.println("Nhập vào số các số nguyên có trong dãy: ");
        n = scanner.nextInt();
      
        for (int count = 1; count <=n; count++) {
            System.out.println("Nhập số thứ " + count + ": ");
            number = scanner.nextInt();
           tong += number;
        }
         
        avgNumber = (float) tong / n;
        System.out.println("Trung bình cộng = " + (avgNumber));
    }
}
