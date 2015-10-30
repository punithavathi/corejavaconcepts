import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		hs.add(30);
		hs.add(20);
		hs.add(30);
		hs.add(30);
		System.out.println("The LinkedHashSet Elements ");
		System.out.println("Before sorting");
		for(Integer  i:hs)

		{
			System.out.println(i);
		}
		
		
		HashSet<Integer> hs1=new  HashSet<Integer>(hs);
	
		System.out.println("The HashSet Elements ");
		for(Integer i1:hs1)
		{
			System.out.println(i1);
		}
	}

}
