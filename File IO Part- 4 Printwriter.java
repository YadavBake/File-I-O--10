
												File I/O Part- 4||Printwriter
											  ==================================
-------------
 PrintWriter 
-------------
 
 -> It is the most Inhanced Writer to write charcter data to the file.

 -> The main advantage of printWriter over FileWriter and BufferedWriter is we can write any type of primitive data 
    to the file.

 -------------  
  Constructor 
 -------------

  1. PrintWriter pw = new PrintWriter(String FileName);

  2. PrintWriter pw = new PrintWriter(File f);

  3. PrintWriter pw = new PrintWriter(Writer w);

 Note: 

	- PrintWriter can communicate directly with the file and can communicate via(waya) writer object also .
	
	
 ---------
  Methods 
 ---------
 
  1. write (int ch)					 6. print(char ch) 				11. println(char ch) 
  2. write (char[]ch)                7. print(int i)                12. println(int i) 
  3. write(String s)                 8. print(double d)             13. println(double d) 
  4. flush()                         9. print(boolean b)            14. println(boolean b)
  5. close()                        10. print(String s)             16. println(String s) 
 
 
 Ex.
 
	import java.io.*;
	class PrintWriterDemo
	{
		public static void main(String args[])throws IOException
		{
			FileWriter fw = new FileWriter("abc.txt");
			PrintWriter pw = new PrintWriter(fw);
			pw.write(100);
			pw.println(100);
			pw.println(true);
			pw.println('c');
			pw.println("durga");
			pw.flush();
			pw.close();
		}
	}
  
 
 
  Q.) What is different write(100) and print(100) ?
  
		- In the case of write of 100 the corrusponding charcter 'd' will be added to the file but in the case of 
		  print of 100 the value 100 will be added to the file directly.


 
 Note:
 
	- The most inhanced writer to write charcter data to the file is printWriter where as the inhanced reader to read 
	  charcter data from the file is BufferedReader.
	  

 Note:
 
	- In general we can use readers and writers to handle charcter data (text data), Where as we can Streams to handle 
	  Binary Data (like images, pdf file, vedio file, audio file etc.).
	  
	- We can use OutputStream to write binary data to the file InputStream to read binary data from the file 
	
	
											Object (Root)
											   |
											   |
			       -----------------------------------------------------------------------------
				   |																		   |
			       |																		   |	
		  Writer(Abstract class) 												    Reader(Abstract class)
				   |																			|
				   |																			|
	-------------------------------------			   							 ---------------------------	
    |					 |				|										 |						   | 		
 OutputStreamWriter  BufferedWriter   PrintWriter						    InputStream				    BufferedReader
     |																			 |				
    FileWriter	 															  FileReader	
										
										

 Q.) Write a program to marge data from two files into a third file.

	import java.io.*;																----------				----------
	class PrintWriterDemo2                                                          | AAA    |              | 111    |
	{                                                                               | BBB    |              | 222    |
		public static void main(String args[])throws IOException                    | CCC    |              | 333    |
		{                                                                           |        |              |        |
			PrintWriter pw = new PrintWriter("file3.txt");                          |        |              |        |
			BufferedReader br = new BufferedReader(new FileReader("file1.txt"));    |        |              |        |
			String line = br.readLine();                                            ----------              ----------
			while(line != null)                                                      file1.txt 				 file2.txt
			{                                                                          |						 |
				pw.println(line);                                                      |----------   ------------|
				line= br.readLine();                                                			 |   |
			}                                                                       			 |   |
			br = new BufferedReader(new FileReader("file2.txt"));                   			 |   |
			line = br.readLine();                                                             ----------
			while(line != null)                                                     		  | AAA    |
			{                                                                                 | BBB    |
				pw.println(line);                                                             | CCC    |
				line = br.readLine();                                                         | 111    |
			}                                                                                 | 222    |
			pw.flush();                                                                       | 333    |
			br.close();                                                                       ----------
			pw.close();                                                                         file3.txt  
		}
	}
				
			
   
 Q.) Write a program to perform file marge opertion where marging should be done line by line alternatevily ?


import java.io.*;
class FileMarger
{
	public static void main(String args[])throws IOException
	{
		PrintWriter pw = new PrintWriter("file3.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
		String line = br1.readLine();							
		String line = br2.readLine();									
		                                                        ----------				----------	
		while((line1 != null) || l(ine2 !=null) )               | AAA    |              | 111    |
		{	                                                    | BBB    |              | 222    |
			if(line1 != null)                                   | CCC    |              | 333    |
			{                                                   |        |              | 444    |
			pw.println(line1);                                  |        |              | 555    | 
			line1= br1.readLine();                              |        |              |        |
			}                                                   ----------              ----------
			if(line2 != null)                                    file1.txt 				 file2.txt
			{                                                      |						 |
			pw.println(line2);                                     |----------   ------------|
			line2= br2.readLine();                              			 |   |
			}                                                   			 |   |
		}                                                       			 |   |
		br = new BufferedReader(new FileReader("file2.txt"));             ----------
		line = br.readLine();                                   		  | AAA    |
		while(line != null)                                               | 111    |
		{                                                                 | BBB    |
			pw.println(line);                                             | 222    |
			line1 = br1.readLine();                                       | CCC    |
		}														          | 333    |
																		  | 444    |	
		                                                        		  | 555    |				
		pw.flush();                                                       ----------
		br.close();                                                         file3.txt  
		pw.close();
	}
}
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
    
    
    
    
	
	
    
	















										