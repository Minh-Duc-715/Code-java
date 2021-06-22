package chuong4;
import java.util.ArrayList;
public class silde16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> arrListString = new ArrayList<>();
	
	
	arrListString.add("java");
	arrListString.add("PHP");
	arrListString.add("C#");
	arrListString.add("C++");
	
	System.out.println("Các phần tử trong arrListString là: ");
	for (int i = 0; i < arrListString.size(); i++ ) {
		System.out.print(arrListString.get(i) + "\t" );
	}

	}

}
