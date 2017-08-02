package JExample2;

import java.io.IOException;

public class Main{
	public static void main(String args[]) {
		 String current = null;
		try {
			current = new java.io.File( "." ).getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println("Current working dir:"+current+"\n");
        
		ReadFile f = new ReadFile("./src/JExample2/input.txt");
		if(f.OpenFile() == null) {
			System.out.print("File not found");
		}
		current = f.NextLine();
		while(current != null) {
			System.out.println(current);
			current = f.NextLine();
		}
		f.CloseFile();
	}
}