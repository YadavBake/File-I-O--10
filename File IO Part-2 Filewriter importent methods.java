
										File I/O Part-2||Filewriter||importent methods
									  ==================================================

-------------
  FileWriter									  
-------------

 -> We can use FileWriter to write Charcter data to the file.

--------------
 Constructors 
--------------

  1. FileWriter fw = new FileWriter(String FileName);
 
  2. FileWriter fw = new FileWriter(File f);
  
   -> The above FileWriters ment for ovrriding of exisiting data. Intiated overriding if we want append operation then 
	  we have to create FileWriter by using the following below Constructors.
	
  
  3. FileWriter fw = new FileWriter(String FileName, boolean append);
  
  4. FileWriter fw = new FileWriter(File f , boolean append);
 
 
 -> If the specified file is not already availabel then all the above constructors will create that file.

-------------------
 Important methods 
-------------------

  1. write(int ch)

		-> To write a single charcter.
		
			fw.write('a');
			fw.write(97);
			
  2. write(char[]ch)
  
		-> To write an array of charcters to the file.
		
  3. write(String s)
  
		-> To write String to the file.
		
  4. flush()
  
		-> To guarantee that total data including last charcter will be return to the file 
		
  5. close() 
		
		-> To close the writer.


 Ex.

	import java.io.FileWrite.*;
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
	
	- In the above programmer FileWriter can perform overriding of exisiting data.
	
	- Initiated of overriding if we want append operation then we have to create FileWriter object as follows 
	
			-------------------------------------------------
			|FileWriter fw = new FileWriter("abc.txt",true);|
			-------------------------------------------------
			

 Note: 
 
	- The main problem with FileWrite is we have to insert line separate ('\n') menually which different from system 
	  to system it diffuclty to the programmer.
	  
	- We can solve this problem by using BufferedWriter and PrintWriter classes.
			