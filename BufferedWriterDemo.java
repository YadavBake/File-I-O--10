
import java.io.*;
class BufferedWriterDemo
{
	public static void main(String args[])throws IOException
	{
		
		FileWriter fw = new FileWriter("xyz.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch1 = {'a','b','c'};
		bw.write(ch1);
		bw.newLine();
		bw.write("durga");
		bw.newLine();
		bw.write("Software Solutions");
		bw.flush();
		bw.close();
	}
}