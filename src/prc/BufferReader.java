package prc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferReader {

	public static void main(String args[]) throws Exception {
		try {
			File obj = new File("‪F:\\om.txt");
			FileReader fr = new FileReader(obj);
			BufferedReader br = new BufferedReader(fr);

			int i;
			while ((i = br.read()) != -1) {
				System.out.print((char) i);
			}
			br.close();
			fr.close();
		} catch (Exception e) {

		}
	}

}
