import java.util.*;
import java.io.*;

// help acquired from https://docs.oracle.com/javase/tutorial/essential/io/cl.html, https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html, https://docs.oracle.com/javase/7/docs/api/java/io/InputStreamReader.html

public class Question4{
	public static void main(String[] args) throws Exception {
		InputStreamReader txt = new InputStreamReader(System.in);

		Scanner readIn = new Scanner(txt);

		while (readIn.hasNext()){
			System.out.print(readIn.nextInt() + "\n");
		}
	readIn.close();
	}
}