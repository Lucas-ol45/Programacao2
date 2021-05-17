package bibliotecas;

public class TestaString3 {
	public static void main(String[] args) {
		
		String a = "Java ADS na veia";
		System.out.println(a);
		char c = a.charAt(4); //Zero Based
		System.out.println(c);
		int i = a.length(); // no zero based
		System.out.println(i);
		
	}
}