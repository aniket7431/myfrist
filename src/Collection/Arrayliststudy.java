package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrayliststudy {

	public static void main(String[] args) {
		
   ArrayList al  = new ArrayList ();
   
   al.add("velocity");
   al.add(123.254);
   al.add("A");
   al.add(null);
   al.add("pune");
   al.add("B");
   System.out.println( al );
	System.out.println(al.size());
	
	
	al.add("pune");
	al.add(3, "good morning");
	System.out.println(al);
		
	al.remove(3);
	al.remove("pune");
	System.out.println(al);
	
	System.out.println(al.contains("B"));
	System.out.println(al.isEmpty());
	System.out.println(al.get(5));
	
	for (int i=0; i<=al.size()-1; i++) {
		
		System.out.println(al.get(i));
	}
	
	Iterator  it=al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
		
		
	}
	//foreach loop
	for(Object o:al)
	{
		System.out.println(o);
	}
   ArrayList<Integer>in = new ArrayList<>();
   in.add(1);
   in.add(3);
   in.add(4);
   in.add(6);
   
   
   for (int i:in)
   {
	   System.out.println(i);
   }
   Iterator<Integer>in1=in.iterator();
   while(in1.hasNext())
   {
	   System.out.println(in1.next());
   }
	   
	
	
	}

	private static void ArrayList() {
		// TODO Auto-generated method stub
		
	}

}
