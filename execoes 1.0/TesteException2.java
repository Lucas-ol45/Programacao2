package execoes;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TesteException2 {
	public static void main(String[] args) {
		try {
			new FileReader("C:\\Arquivodeteste.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IllegalAccessError e){
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			//conn.close();
		}
	}
}