package fbprg;

public class Array {

	public static void main(String[] args) {
		
	
		
		int Student_id[]= new int[4];
		
          Student_id[0]=  2;
          Student_id[1]= 4;
          Student_id[2]= 8;
          Student_id[3]= 10;
          
          System.out.println("Student id is"+ Student_id[0]);
          
	

	String Student_name []= new String[3];
	{
	     Student_name[0]="Ravi";
	     Student_name[1]="Sam";
	     Student_name[2]="Giri";
	    	     
	     int SizeofArray = Student_name.length;   
	     
	     System.out.println("Length of array is" +SizeofArray);
	     for (int i=0; i<SizeofArray; i++)
	     {
	    	 System.out.println("Student name"+Student_name[2]);
	    	 System.out.println("Student name is" + Student_name[1]);
	     }
	}
	    	
	
	
	}    
	
	
}
