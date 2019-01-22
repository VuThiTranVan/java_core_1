package train.vanvtt.session9.exceptionExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HandleWithFinally {
	public void example() {
		FileInputStream inputStream = null;
		try {
			File file = new File("./tmp.txt");
			inputStream = new FileInputStream(file);

			// use the inputStream to read a file
			int i = inputStream.read();
			System.out.print((char) i);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
