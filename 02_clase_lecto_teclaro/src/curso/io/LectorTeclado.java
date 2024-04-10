package curso.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Crear una clase para lectura de datos por teclado. Esa clase, tendrá tres médotos:

readString ()
eadInt()
readDouble() */
public class LectorTeclado extends BufferedReader {
	public LectorTeclado() {
		super(new InputStreamReader(System.in));
	}
	public String readString() {
		try {
			return readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	public int readInt() {
		try {
			return Integer.parseInt(readLine());
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}
	public Double readDouble() {
		try {
			return Double.parseDouble(readLine());
		} catch (IOException e) {
			e.printStackTrace();
			return 0.0;
		}
	}

}
