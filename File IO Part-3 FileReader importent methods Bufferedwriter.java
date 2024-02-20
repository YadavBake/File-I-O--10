
										File I/O Part-3||FileReader||importent methods||Bufferedwriter
									  ==================================================================

 ------------
  FileReader 
 ------------
  
  - We can use FileReader to read chacter data from the file.

-------------
 Constructor 
-------------

 1. FileReader fr = new FileReader(String FileName);

 2. FileReader fr = new FileReader(File f);
 
 ---------------------------------
  Important Method for FileReader
 ---------------------------------
 
  1. int read()
	 ---
	  |--> int reprasent unicode value of that chacter
	  
	  int i = fr.read();
	  System.out.println(i);

	- It attemps to read next chacter from the file and returns it's unicode value.

	- If the next chacter not available then this method returns -1.
	
	- As this method returns unicode value (int value), at the time printing we have to perform typeCasting.
	
	  Ex. 
	  
	  
	  class FileReaderDeomo
	  {
		  public static void main(String args[])
		  {
			  FileReader fr  = new FileReader("abc.txt");
			  int i = fr.read();
			  while(i != -1)
			  {
				  System.out.println((char)i);
				  i=fr.read();
			  }
		  }
	  }

  2. int read(char[]ch)

		-> It attemps to read enough chacters from the file into char [] and returns number of chacters copyed from the 
		   file.
		   
		    import java.io.*;
			class Test 
			{
				public static void main(String args[])throws IOException
				{
					
					File f = new File("abc.txt");
					char [] ch = new char[(int)f.length()];
					FileReader fr = new FileReader(f);
					fr.read(ch);
					for(ch1 : ch)
					{
						System.out.println(ch1);
					}
				}
			}
	
  3. void close()
  



  Ex. 
  
  
		import java.io.*;
		class FileReaderDemo1
		{
			public static void main(String args[])throw IOException
			{
				File f = new File("abc.txt");
				FileReader fr = new FileReader(f);
				char ch[] = new char[(int)f.length()];
				fr.read(ch);
				for(char ch1: ch)
				{
					System.out.println(ch1);
				}
				System.out.println("****************");
				FileReader fr1 = new FileReader("abc.txt");
				int i = fr1.read();
				while ( i != -1)
				{
					System.out.println((char )i);
					i = fr1.read();
				}
			}
		}
		
			
 Note: 

	- By using FileReader we can read data charcter by charcter which is not convient to the programmer.
	

 -> Uses of FileWriter and FileReader is not recomanded because:-
 
	1. While writing data by FileWriter we have to insert line separetor '\n' manually which different from System to 
	   System it is difficult to the programmer.
	   
	2. By using FileReader we can read data charcter by charcter, Which is not convient to the programmer. 
	
 
 -> To overcome this problems we should go for BufferedWriter and BufferedReader.

------------------
  BufferedWriter
------------------

 -> We can use BufferedWriter to write charcter data to the file.


  Constructors   
 --------------
 
  1. BufferedWriter bw = new BufferedWriter(Writer w);
  
	    -----------------		  					
						|            ---------			
						-------------|	     |				
						             |		 |			
						-------------|		 |			
						| FileWriter |		 |				
		-----------------	         ---------			
		 BufferedWriter				   xyz.txt 				
		 
  
  2. BufferedWriter bw = new BufferedWriter(writer w, bufferSize); 		 
  
  
 Note:

	- BufferedWriter can not communicate directly with the file it can communicate via sum Writer object.
	
	
 Q). Which of the following are valid ?
 
	 1. BufferedWriter bw = new BufferedWriter("abc.txt");// invalid because BufferedWriter can't communicate directly 
													      // with text file 
	 
	 2. BufferedWriter bw = new BufferedWriter(new File("abc.txt"));//invalid 
	 
	 3. BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));//valid 
	 
	 4. BufferedWriter bw = new BufferedWriter(new BufferedWriter(new FileWriter("abc.txt"))); valid 
	 
			------------------------
									|	
								 -----------------		  				
	                            				|            ---------	
                                				-------------|	     |	
                                				             |		 |	
                                				-------------|		 |	
                                				| FileWriter |		 |	
                                -----------------	         ---------	
                                 Buf|feredWriter				   xyz.txt 	
			-------------------------					 
			   BufferedWriter
			   
							Two level buffering 
							
							
 ----------							
   Methods 
 ----------   
 
  1. write (int ch)
  2. write (char[]ch)
  3. write(String s)
  4. flush()
  5. close()
 *6. newLine()
		
		- To insert a line separetor.
		
		
 Q.) When compaired with FileWriter which of the following capability available extra in method form in BufferedWriter ?


	1. Writing data to the file.
	2. Close the file.
	3. flusing the file.
	4. inserting a new line charcter.//valid 
	
	
 Ex. 
	
	import java.io.*;
	class BufferedWriterDemo
	{
		public static void main(String args[])throws IOException
		{
			
			FileWriter fw = new FileWriter("xyz.txt");			----------------------
			BufferedWriter bw = new BufferedWriter(fw);			| d				     |
			bw.write(100);										| abc                |
			bw.newLine();										| durga              |
			char[] ch1 = {'a','b','c'};                         | Software Solutions |             
			bw.write(ch1);                                      |                    |
			bw.newLine();                                       |                    |
			bw.write("durga");									|                    |
			bw.newLine();                                       |                    |
			bw.write("Software Solutions");                     |                    |
			bw.flush();                                         |                    |
			bw.close();											----------------------	
		}															xyz.txt file 
	}
	
		  
 Note:
 
	- Whenever we are closing BufferedWriter autometically internal FileWriter will be closed and we are not required to 
	  close exiplicitly.
	  
		==================================		-----------------		  				
		|bw.close()|fw.close()|bw.close()|      				|            ---------
		|		   |		  |fw.close()|      				-------------|	     |
		| valid    |		  |	         |      				             |		 |
		==================================      				-------------|		 |
                                                				| FileWriter |		 |
                                                -----------------	         ---------
                                                 BufferedWriter				   xyz.txt 
                                                 
-----------------
  BufferedReader												 
-----------------

 -> We can use BufferedReader  to read charcter data from the file.

 -> The main advantage of BufferedReader when compaired with FileReader is we can read data line by line in addition to 
    charcter by charcter.

 
  Constructors 
 --------------
  
  1. BufferedReader br = new BufferedReader(Read r);

  2. BufferedReader br = new BufferedReader(Read r, int bufferSize);	
		
 Note: 

	- BufferedReader can't communicate directly with the file and it can communicate via some reader object.
	

  Methods 	
 --------
	
   1. int read()
   2. int read(char[] ch)
   3. void close()
   
   4. String readLine()
	
		- It attemps to read next line from the file and returns it If the next line not available then this method 
		  returns null. 
		  
		
	import java.io.*;
	class BufferedReaderDemo 
	{														-----------------		  				
		public static void main(String args[]) throws IOException			|            ---------
		{                                                   				-------------|qfnqf  |
			FileReader fr = new FileReader("xyz.txt");      				             |lmqmc	 |
			BufferedReader br = new BufferedReader(fr);     				-------------|flqnf	 |
			String line = br.readLine();                    				| FileReader |lnqw	 |
			while(line != null)                             -----------------	         ---------
			{                                                BufferedReader				   xyz.txt 
				System.out.println(line);                    
				line= br.readLine();
			}
		}
	}
	
 Note: 

	- Whenever we are closing BufferedReader autometically underlaying FileReader will be closed and we are not 
	  required to close exiplicitly.
	  
	- The most inhanced reader to read charcter data from the file is BufferedReader.  