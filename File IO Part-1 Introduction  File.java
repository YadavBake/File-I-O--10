
										
                                          File I/O Part-1|| Introduction || File
                                        =========================================

============================================================================================================================										
 ----------
  File I/O
 ----------

													1. File.
													2. FileWriter.
													3. FileReader.
													4. BufferedWriter.
													5. BufferedReader.
													6. PrintWriter.
	
============================================================================================================================	
 ------
  File 
 ------

 -> File f = new File("abc.txt"); 
	This line won't create any physical file first it will check is there any physical file named with 'abc.txt' is 
	available or not if it is available then 'f' simply referes that file.
	
	If it is not available then we are just creating java file object to reprasent the name 'abc.txt'.
	
	Ex.	
	
	import java.io.*;
	class Test 
		{
			public static void main(String args[]) throws IOException
			{
				File f = new File("abc.txt");
				System.out.println(f.exists());//false 
				f.createNewFile();
				System.out.println(f.exists()); //true 
				
			}
		}
		
		1st Run			2nd Run 
		
		false 			true 
		true 			true 
		
		
 -> We can use java file object to reprasent directory also.

	import java.io.*;
	class Test 
	{
		public static void main(String args[])
		{
			File f = new File("Durga123");
			System.out.println(f.exists());
			f.mkdir();
			System.out.println(f.exists());
		}
	}
	
 Note: 

	- In unix everything is treated as file java File I/O concept is implemented based on Unix operating System hence 
	  a java file object can be used to reprasent both files and directories.
	  
	
-------------------------
 File Class Constructors 
-------------------------

  1. File f  = new File(String name);

	 - Creates a java file object to reprasent name of the file or directory in current working directory.

  2. File f  = new File(String subdirname, String name);
  
	 - Creates a java file object to reprasent name of file or directory prasent in specified sub_directory. 
	 
  
  3. File f  = new File(File subdir,String name);
  
	 - Creates a java file object to reprasent name of file or directory prasent in specified sub_directory.


 Ex 1. Write code to create a file named with 'abc.txt' in current working directory ? 
 
 
		class Test 
		{
			public static void main(String args[])
			{
				
				File f = new File("abc.txt");
				f.createNewFile();
			}
		}
		
			CWD
			 |
			 |-->abc.txt 
			 

  Ex 2. Write code create  a directory named with durga123 in Current working directory, and create a file named with
	    demo.txt in that directory ?
		
			class Test 																----------------
			{                                                                       |			   |	
				public static void main(String args[]) throws IOException           |   --------   |
				{                                                                   |   |	   |   |	
					File f = new File("Durga123.txt");                              |	|	   |<--------f1 
					f.mkdir();                                                      |	|	   |   |
					File f1 = new Fil("Durga123","demo.txt");                       |	--------   |<--f
									//or                                            |	demo.txt   |
									                                                |              |
					File f1 = new File(f,"demo.tct");                               |              |
					f1.createNewFile();                                             ----------------
				}                                                                     Durga123.txt 
			}
			
			
 Ex 3. To create a file named with abc.txt in E: xyz folder ?

	
		class Test 
		{															 E:
			public static void main(String args[])                   |
			{                                                        |-->xyz 
																		  |	
				File f = new File("C:\\xyz", "abc.txt");				  |--> abc.txt 	
				f.createNewFile();
			}
		}
			
		- Assume E: xyz is already available in our system.


 ------------------------------------------
  Imoprtant methods prasent in File class 
 ------------------------------------------

  1. boolean exists();

	  - returns true If the specified file or directory available.
	  
  2. boolean createNewFile();
  
	  - First these method will check whether the specified file is already available or not if it is already available 
	    then these method returns false without creating any physical file.
		
	  - If the file is not already available then these method will creates a new file and returns true.
	  
  3. boolean mkdir();
  
	- First these method will check whether the specified directory is already available or not if it is already available 
	  then these method returns false without creating any physical directory.
	  		
	- If the directory  is not already available then these method will creates a new directory and returns true.		
			
  4. boolean isFile();

	- returns true if the specified object pointing to physical file.
	
	
  5. boolean isDirectory 	
			
			
	- returns true if 'f' pointing to directory.		
			
  6. String  [] list();

	- This method returns the name of all files and directories prasent in specified directory.
	

  7. long length();
  
	- returns number of chacter prasent in  the specified file.
	
  8. boolean delete();
  
	- To delete specified file or directory.
	
	
 -> Write program to display the names of all files and directories prasent in C:\\durga_classes ?

		import java.io.*;
		class Test 
		{
			public static void main(String args[])throws IOException
		 	{
		 		int count = 0;
		 		File f = new File("C:\Program Files");
		 		String s = f.list();
		 		for(String s1 :s)
		 		{
		 			count++;
		 			System.out.println(s)
		 		}
		 		System.out.println(" The total number " :+count);
		 	}
		 }
 
 -> To display only file names 
 
 
 
		import java.io.*;
        class Test 
        {
        	public static void main(String args[])throws IOException
         	{
         		int count = 0;
         		File f = new File("C:\Program Files");
         		String[]s = f.list();
         		for(String s1 :s)
         		{
					File f1 = new File(f,s1);
         			if(f1.isFile())
					{
						count++;
						System.out.println(s1);
					}
         		}
         		System.out.println(" The total number :" +count);
         	}
         }


 -> To display only directory names ?

		import java.io.*;
        class Test 
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
         		System.out.println(" The total number " :+count);
         	}
         }
		 
	In in the above program we have replace isFile() method with  isDirectory() method.	 