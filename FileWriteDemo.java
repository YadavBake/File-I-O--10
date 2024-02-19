
	import java.io.*;
	class FileWriteDemo 
	{
		public static void main(String [] args)throws IOException
		{
			
			FileWriter fw = new FileWriter("baake.txt");
			fw.write(100);// adding a single charcter
			fw.write("urga\nSoftwareSolution");
			fw.write('\n');
			char [] ch1 ={'a','b','c'};
			fw.write(ch1);
			fw.write('\n');
			fw.flush();
			fw.close();
		}
	}
	
		