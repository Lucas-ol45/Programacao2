package bibliotecas;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class EscreveArquivo {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("teste3.txt"); // This is a class that gets a file
			OutputStreamWriter osw = new OutputStreamWriter(os);

			BufferedWriter bw = new BufferedWriter(osw);
			String s = null;

			bw.write("A turma de ADS ama Java");

			bw.close();
			osw.close();
			os.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}