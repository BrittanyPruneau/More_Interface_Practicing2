package guitar;

import java.awt.List;
import java.util.ArrayList;

public class GuitarApp 
{
	public static void main(String[] args) 
	{
		Guitar guitar1 = new Guitar(true, 6);
		Guitar guitar2 = new Guitar(false, 12);
		Guitar guitar3 = new Guitar(true, 6);
		String s = "string";
		String v = "string"; 
		String t = "String"; 
		String u = "nothing";  
		System.out.println("'string' and 'String' are NOT pointing to the same place in memory " + s.equals(t)); 
		System.out.println("'string' and 'string' are pointing to the same place in memory " + s.equals(v)); 
		System.out.println("So we are going to override the Equals method. We want Objects of the same values to be equal ");
		System.out.println();
		
		Guitar [] guitars = {guitar1,guitar2,guitar3}; 
		for(Guitar g : guitars)
		{
			System.out.println(g.toString());
		}
		System.out.println("guitar1 equals guitar2: " + guitar1.equals(guitar2));
		System.out.println("guitar1 equals guitar3: " + guitar1.equals(guitar3));
		System.out.println("They are not equal because guitar1 does not point to guitar3 they are different objects. ");

		System.out.println("Using .compareTo() 1 vs 2  " + guitar1.compareTo(guitar2));
		System.out.println("Using .compareTo() 1 vs 3  " + guitar1.compareTo(guitar3));

	}

}
