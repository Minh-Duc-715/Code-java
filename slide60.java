package chuong4;
import java.util.Set;
import java.util.LinkedHashSet;

public class slide60 {

	public static void main(String[] args) {
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Java");
		linkedHashSet.add("Java");
		linkedHashSet.add("Java");
		linkedHashSet.add("Java");
		
		for (String str : linkedHashSet) {
			System.out.println(str);
		}

	}

}
