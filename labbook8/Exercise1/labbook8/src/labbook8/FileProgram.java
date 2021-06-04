package labbook8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram {
	public static void main(String[] args) throws IOException {
		FileReader inputStream = new FileReader("source.txt");
		FileWriter outputStream = new FileWriter("target.txt");
		CopyDataThread t=new CopyDataThread(inputStream,outputStream);
		Thread t1=new Thread(t);
		t1.start();
	}
}
