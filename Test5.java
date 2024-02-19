import java.io.*;
class Test5 
{
	public static void main(String args[])throws IOException
 	{
 		int count = 0;
 		File f = new File("D:\\java_note_Durga_sir");
 		String[]s = f.list();
 		for(String s1 :s)
 		{
			File f1 = new File(f,s1);
 			if(f1.isDirectory())
			{
				count++;
				System.out.println(s1);
			}
 		}
 		System.out.println(" The total number:" +count);
 	}
 }