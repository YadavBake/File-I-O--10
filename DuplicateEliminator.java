
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
				                                                        
                                                                        
																		
																		
																		