
												File I/O Part- 5||Printwriter-Examples
											=============================================

 Q.) Write a program to perform file extraction operation ?

		----------				----------
        | 111    |              |        |
        | 222    |              | 222    |
        | 333    |              | 555    |			-----------------------
        | 444    |              | 666    |			|output = Input-delete|
        | 555    |              |        |			-----------------------
        | 666    |              |        |
        ----------              ----------
         Input.txt 				 delete.txt
           |						 |
           |----------   ------------|
        			 |   |
        			 |   |
        			 |   |
                  ----------
        		  |        |
                  | 111    |
                  | 333    |
                  | 444    |
                  |        |
                  |        |
                  ----------
                  output.txt  
				  
  import java.io.*;	
  class FileExtractionDemo 
  {
	  public static void main(String args[])throws IOException
	  {
		  PrintWriter pw = new PrintWriter("output.txt");
		  BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));
		  String line = br1.readLine();
		  while(line != null)
		  {	
			  boolean available = false;
			  BufferedReader br2 = new BufferedReader(new FileReader("delete.txt"));
			  String target = br2.readLine();
			  while(target != null)
			  {
				  if(line.equals(target))
				  {
					  available = true;
				      break;
				  }
				  target = br2.readLine();
			  }
			  if(available == false)
			  {
				  pw.println(line);
			  }
			  line = br1.readLine();
		  }
		  pw.flush();
		  
	  }
  }	


  Q.) Write a java program to remove duplicates from the given input file ?


	 import java.io.*;	
  class FileExtractionDemo 
  {
	  public static void main(String args[])throws IOException
	  {
		  PrintWriter pw = new PrintWriter("output.txt");
		  BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));
		  String line = br1.readLine();
		  while(line != null)
		  {	
			  boolean available = false;
			  BufferedReader br2 = new BufferedReader(new FileReader("delete.txt"));
			  String target = br2.readLine();
			  while(target != null)
			  {
				  if(line.equals(target))
				  {														----------
					  available = true;                                 | 111    |
				      break;                                            | 222    |
				  }                                                     | 444    |
				  target = br2.readLine();                              | 444    |
			  }                                                         | 555    |
			  if(available == false)                                    | 666    |
			  {                                                         | 555	 |
				  pw.println(line);                                     | 666	 |
				  pw.flush();                                           | 777	 |
			  }                                                         | 777	 |
			  line = br1.readLine();                                    ----------
		  }                                                              Input1.txt
		                                                                	||
		                                                                 ----------
	  }                                                                  | 111    |
  }	                                                                     | 222    |
				                                                         | 333    |
                                                                         | 444    |
																		 | 555    |
																		 | 666    |
																		 | 777	  |
																		 ----------
																		output1.txt
				
				
				
	
  import java.io.*;	
  class DuplicateEliminator 
  {
	  public static void main(String args[])throws IOException
	  {
		  PrintWriter pw = new PrintWriter("output2.txt");
		  BufferedReader br1 = new BufferedReader(new FileReader("Input1.txt"));
		  String line = br1.readLine();
		  while(line != null)
		  {	
			  boolean available = false;
			  BufferedReader br2 = new BufferedReader(new FileReader("output2.txt"));
			  String target = br2.readLine();
			  while(target != null)
			  {
				  if(line.equals(target))
				  {														
					  available = true;                                 
				      break;                                            
				  }                                                     
				  target = br2.readLine();                              
			  }                                                         
			  if(available == false)                                    
			  {                                                         
				  pw.println(line);                                     
				  pw.flush();                                           
			  }                                                         
			  line = br1.readLine();                                    
		  }                                                             
		                                                                
		                                                                
	  }                                                                 
  }	                                                                    
				                                                        
                                                                        
																		
																		
																					
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				