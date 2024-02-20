import java.io.*;
		class FileReaderDemo1
		{
			public static void main(String args[])throws IOException
			{
				System.out.println("************** First Approach ****************");
				File f = new File("baake.txt");
				FileReader fr = new FileReader(f);
				char ch[] = new char[(int)f.length()];
				fr.read(ch);
				for(char ch1: ch)
				{
					System.out.print(ch1);
				}
				System.out.println("************** Second Approach ****************");
				FileReader fr1 = new FileReader("baake.txt");
				int i = fr1.read();
				while ( i != -1)
				{
					System.out.print((char)i);
					i = fr1.read();
				}
			}
		}