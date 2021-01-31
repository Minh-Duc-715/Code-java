package baitrenlop;

import java.util.Scanner;

public class chanle {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int a;
	System.out.println("Moi anh dep trai nhap vao so a:");
	a = scanner.nextInt();
	if(a%2 == 0) {
		System.out.println("a la so chan");
	} else {
		System.out.println("a la so le");
	}
		
	}

}
