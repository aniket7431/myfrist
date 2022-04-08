package star_program;

public class tringle_right_descending {
//
	// *****
	//  ****
	//   ***
	//    **
	//     *
	public static void main(String[] args) {

     int space = 0; // on the frist row ther is no space space 0
     int star =5 ;// outer loop for the on of row =5
		
     
     for (int i=1; i<=5 ; i++)
     {
    	 
    	 for (int j=1; j<=space ;j++)// 1st counsidar inner for loopfor the space
    		 
    	 {
    		System.out.print(" ");  // use single space and print for inner for loop
    		 
    	 }
    	 for (int j=1 ;j<=star ;j++)
    	 {
    		 System.out.print("*");
    	 }
    	System.out.println();
    	space++;
    	star--;
    	
    	 
    	 
     }
		
		
		
		
		
	}

}
