import java.io.*;
class Test4 
{
	public static void main(String args[])throws IOException
	{
		int count = 0;
		File f = new File("C:\\Program Files");
		String[] s = f.list();
		for(String s1 :s)
		{
			count++;
			System.out.println(s1);
		}
		System.out.println(" The total number : " +count);
	}
}