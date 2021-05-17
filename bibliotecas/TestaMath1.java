package bibliotecas;

public class TestaMath1 {
	public static void main(String[] args) {
//		int i = -10;
		//System.out.println(i);
		//int j = Math.abs(i);
		//System.out.println(j);
		//System.out.println(Math.abs(i));

		//double d1 = 4.16000;
		//System.out.println(d1);
		//double d2 = 4.0;
		//System.out.println(d2);

		//double d3 = Math.round(d1);
		//System.out.println(d3);

		//double d4 = Math.max(d1, d3);
		//System.out.println(d4);

		//System.out.println(Math.ceil(d1));
		//System.out.println(Math.floor(d1));

		// tarefas para a turma:
		// implementar e testar Math.min()
		
		float num1 = 3.3f;
		float num2 = 3.4f;
		System.out.println("Math.min(): "+Math.min(num1,num2)); 
		
		// funções ceil e floor
		float num3 = 3.3f;
		
		System.out.println("Math.ceil(): "+Math.ceil(num3));
		System.out.println("Math.floor(): "+Math.floor(num3));
		
		// implementar >>TestaMath2 e testar Math.exp,
		float num4 = 3.4f;
		
		System.out.println("Math.exp(): "+Math.exp(num4));
		// Math.log, Math.pow, Math.sqrt, log de a na base b
		float num5 = 5.7f;
		
		System.out.println("Math.log(): "+Math.log(num5));
		System.out.println("Math.Pow(): "+Math.pow(num5, num4));
		System.out.println("Math.sqrt(): "+Math.sqrt(num5));
		
		// implementar >>TestaMath3 e ver a diferença de Math.sin
		System.out.println("Math.sin(): "+Math.sin(num5));
		// e Math.toDegrees, Math.toRadians
		System.out.println("Math.toDegress(): "+Math.toDegrees(num5));
		System.out.println("Math.toRadians(): "+Math.toRadians(num5));
	}
}