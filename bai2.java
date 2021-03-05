package baitrenlop;

import java.util.Scanner;
public class bai2 {
	public static void main(String[] args) {
		SPP sp = new SPP();			
		sp.nhap1(null, 0, 0);
		sp.nhap2(null, 0, 0);
		sp.xuat();
	}
}
class SPP {
	String tenSP;
	double donGia;
	int soLuong;
	String tenSP2;
	double donGia2;
	int soLuong2;
	void nhap1(String tenSP, double donGia,int soLuong) {
		Scanner scanner = new Scanner(System.in);
		 
		System.out.println("Nhập vào tên sản phẩm 1: ");
	    tenSP = scanner.nextLine();
	    
	    System.out.println("Nhập vào đơn giá sản phẩm: ");
	    donGia = scanner.nextFloat();
	    
	    System.out.println("Nhập vào số lượng sản phẩm: ");	    
	    soLuong = scanner.nextInt();
	}
	void nhap2(String tenSP2, double donGia2,int soLuong2 ) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Nhập vào tên sản phẩm 2: ");	    
	    tenSP2 = scanner.nextLine();
	    
	    System.out.println("Nhập vào đơn giá sản phẩm 2: ");
	    donGia2 = scanner.nextFloat();	
	    
	    System.out.println("Nhập vào số lượng sản phẩm 2: ");
	    soLuong2 = scanner.nextInt();
	}
	void xuat() {
		System.out.println("Tên sản phẩm 1 là: " + tenSP );
		System.out.println("Đơn giá sản phẩm 1 là: " + donGia );
		System.out.println("Số lượng sản phẩm 1 là: " + soLuong );
		System.out.println("Tên sản phẩm 2 là: " + tenSP2 );
		System.out.println("Đơn giá sản phẩm 2 là: " + donGia2 );
		System.out.println("Số lượng sản phẩm 2 là: " + soLuong2 );
		
	}
}
