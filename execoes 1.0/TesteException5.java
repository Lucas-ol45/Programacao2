package execoes;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TesteException5 {
	public static void main(String[] args) {
		TesteException4 t1 = new TesteException4();
		try {
			t1.Metodo1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}