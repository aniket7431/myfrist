package star_program;

public class tringle_right_Acending {


	//    *
	//   **
	//  ***
	// ****
	//*****
	public static void main(String[] args) {

int space =4;   //space in frist row space =4
int star = 1;  // star on frist row star =1

for (int i=1;i<= 5;i++) // outer loop for no rows 5

{  for (int j=1; j<= space ; j++)
{
	System.out.print(" "); // don't use println()
	}
for (int j =1 ; j<=star ;j++)
{
	System.out.print("*");
	}
	
System.out.println();
space--;
star++;

	
}
		

	}

}
