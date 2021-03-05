package baitrenlop;

import java.util.Scanner;
public class bai1 {
	public static void main(String[] args) {
		SP sp = new SP();
		sp.nhaptenSP();
		sp.nhapdonGia();
		sp.nhapgiamGia();
		sp.xuattenSP();
		sp.xuatdonGia();
		sp.xuatgiamGia();
		sp.xuatThueNhapKhau();
		
	}
}
class SP {
	String tenSP;
	double donGia;
	double giamGia;
	double giamGiaa;
	double ThueNhapKhau;
	
	void nhaptenSP() {
		System.out.println("Nhập vào tên sản phẩm: ");
	    Scanner scanner = new Scanner(System.in);
	    tenSP = scanner.nextLine();
	}
	void nhapdonGia() {
		System.out.println("Nhập vào giá sản phẩm: ");
	    Scanner scanner = new Scanner(System.in);
	    donGia = scanner.nextFloat();
	}
	void nhapgiamGia() {
		System.out.println("Nhập vào giảm giá sản phẩm: ");
	    Scanner scanner = new Scanner(System.in);
	    giamGia = scanner.nextFloat();
	}
	void xuatThueNhapKhau() {
		ThueNhapKhau = donGia/10 ;
		System.out.println("Thuế nhập khẩu là: " + ThueNhapKhau );
	}
	
	void xuattenSP() {
		System.out.println("Tên sản phẩm là: " + tenSP );
	}
	void xuatdonGia() {
		System.out.println("Đơn giá sản phẩm là: " + donGia );
	}
	void xuatgiamGia() {
		giamGiaa = donGia - ( giamGia / 100);
		System.out.println("Giá sản phẩm sau giảm là: " + giamGiaa );
	}
	
}
