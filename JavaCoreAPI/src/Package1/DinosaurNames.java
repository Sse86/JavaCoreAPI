package Package1;

import java.util.ArrayList;
import java.util.List;

public class DinosaurNames {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("렉스");
		names.add("프테라");
		names.add("세비아");
		names.add("마르테");
		names.add("줄리아");
		names.add("비비");
		names.add("파르마");
		names.add("리오");
		names.add("켈리");
		names.add("비비앙");
		
		StringBuilder sb = new StringBuilder();
		
		for(String name:names) {
			sb.append(name);
			sb.append(" ");
		}
		
		String allNames = sb.toString();
		System.out.println(allNames);
	}

}
