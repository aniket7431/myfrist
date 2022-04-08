package star_program;

public class Triangle_lift_Ascending {

	//*
	//**
	//***
	//****
	//*****
	
	//step 1 count rows= 05 count columns = 05
	public static void main(String[] args) {

		int star = 1;  // write no  of  star in frist row 
		for (int i =1; i<=5; i++) // outer for loop used for rows
		{
			for (int j=1; j<=star ;j++) //inner loop for columns
			{
				System.out.print("*");
			}
			
			System.out.println(); // after printing star go on next line
			star++;
			
		}
		
	
		
		
	}

}
