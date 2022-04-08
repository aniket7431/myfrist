package star_program;

public class star_box {

	//     ***** Row =3
	//     ***** columns =5
	//     *****  alwayas start with rows 
	
	public static void main(String[] args) {

		// outer for loop for row (  count row ) here row  =3
		for (int i =1 ; i<= 3;i++)
		{
			//inner  loop for columns (count columns ) here colum=5
			for (int j=1 ;j<=5; j++) {
				System.out.print("*"); // note use print only
			}
			
			System.out.println(); //on next line use println
		}
		
		
	}

}
