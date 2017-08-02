package JExample2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile{
	private static String filename, line;
	private BufferedReader br = null;
	public ReadFile(String fname) {
		filename = fname;
	}
	public BufferedReader OpenFile() {
		try {
			br = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
		}
		return br;
	}
	public String NextLine() {
		line = null;
		try {
			line=br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return line;
	}
	public void CloseFile() {
		 try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
	}
	
}