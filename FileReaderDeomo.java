
import java.io.*;
class FileReaderDeomo
{
	  public static void main(String args[])throws IOException
	  {
		  FileReader fr  = new FileReader("baake.txt");
		  int i = fr.read();
		  while(i != -1)
		  {
			  System.out.println((char)i);
			  i=fr.read();
		  }
	  }
}