package baitrenlop;
import java.text.DecimalFormat;
import java.util.Scanner;
public class tinhtonghieutichthuong {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.println("Nhap vao so thu nhat: ");
		int a = scanner.nextInt();
		System.out.println("Nhap vao so thu hai: ");
		int b = scanner.nextInt();
		
		int tong = a + b;
		System.out.println(a  + "+" + b + "=" +tong);
		int hieu = a-b;
		System.out.println(a + "-" +b + "=" +hieu);
		int tich = a * b;
		System.out.println(a  + "*" + b + "=" +tich);
		int thuong = a / b;
		System.out.println(a  + "/" + b+ "=" +thuong);
		int phanDu = a % b;
		System.out.println(a  + "%" + b + "=" +phanDu);
		// so sanh 2 so a va b
		if(a >= b) {
			System.out.println("So thu nhat lon hon so thu hai" );
		}else {
			System.out.println("So thu nhat be hon so thu hai");
		}
		
		
		
	}
}
