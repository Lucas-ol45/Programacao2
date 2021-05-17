package bibliotecas;

public class TestaString2 {
	public static void main(String[] args) {
		String a = "Java ADS na veia";
		String b[] = a.split(" ");
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		
		String c = "Java ads na veia";
		int i = a.compareTo(c);
		
		System.out.println(i);
		
		int k = a.compareToIgnoreCase(c);
		System.out.println(k);
		
		
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		
		
		
	}
}