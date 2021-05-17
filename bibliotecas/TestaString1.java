package bibliotecas;

public class TestaString1 {
	public static void main(String[] args) {
		String a = new String("Java ADS na veia");
		String b = "Java ADS na veia";
		//comparação por valor
		if(a==b) {
			System.out.println("A e B são iguais");
		} else {
			System.out.println("A e B são diferentes");
		}
		//comparação por referência 
		if(a.equals(b)) {
			System.out.println("A e B são iguais");
		} else {
			System.out.println("A e B são diferentes");
		}
	}
}