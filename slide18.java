package chuong4;
import java.util.ArrayList;
import java.util.Iterator;
public class slide18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Float> arrListFloat = new ArrayList<>();
		
		arrListFloat.add(0.7f);
		arrListFloat.add(7.26f);
		arrListFloat.add(1.0f);
		arrListFloat.add(9.3f);
		
		Iterator<Float> iterator = arrListFloat.iterator();
		
		System.out.println("Các phần tử có trong arrListFloat là: ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() +"\t");
		}
	}

}
