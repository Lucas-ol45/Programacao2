package bibliotecas;

public class TestaString1 {
	public static void main(String[] args) {
		String a = new String("Java ADS na veia");
		String b = "Java ADS na veia";
		//compara��o por valor
		if(a==b) {
			System.out.println("A e B s�o iguais");
		} else {
			System.out.println("A e B s�o diferentes");
		}
		//compara��o por refer�ncia 
		if(a.equals(b)) {
			System.out.println("A e B s�o iguais");
		} else {
			System.out.println("A e B s�o diferentes");
		}
	}
}