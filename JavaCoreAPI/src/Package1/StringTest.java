package Package1;

public class StringTest {

	public static void howManyObjectsString() {
		String s= "The";
		s += " quick";
		System.out.println(s);
		
		s.concat(" brown fox" );
		System.out.println(s);
		s = s.concat(" brown fox");
		System.out.println(s);
	}
	
	public static void whatHappens(String s,StringBuilder sb) {
		s=s.concat("there");
		sb.append("there");
		System.out.println("whatHappens: "+s);
		System.out.println("whatHappens: "+sb );
		
		
	}
	
	public static void main(String[] args) {
		
	//	howManyObjectsString();
		String s = "Hi ";
		StringBuilder sb = new StringBuilder("Hi ");
		whatHappens(s,sb);
		
		System.out.println("main: "+s);
		System.out.println("main: "+sb);
	}

}
