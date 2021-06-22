package chuong4;
import java.util.HashSet;
import java.util.Scanner;
public class slide56 {

	public static void main(String[] args) {
		String name;
		HashSet<String> hashSetString = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		
		hashSetString.add("Wilson");
		hashSetString.add("Nike");
		hashSetString.add("Volvo");
		hashSetString.add("Kia");
		hashSetString.add("Lenovo");
		hashSetString.add("Lenovo");
		
		//hiển thị các phần tử trong hashSetString
		System.out.println("Các phần tử trong hashSetString: ");
		System.out.println(hashSetString);
		System.out.println("Nhập các phần tử cần xóa: " );
		name = scanner.nextLine();
		
		if (hashSetString.contains(name)) {
			hashSetString.remove(name);
			System.out.println("Xóa thành công!");
			System.out.println("Các phần tử còn lại trong hasSetString: ");
			System.out.println(hashSetString);
		} else {
			System.out.println("Xóa không thành công!");
		}
		

	}

}
