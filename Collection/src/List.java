import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;



public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> hs=new ArrayList<Integer>();
		hs.add(20);
		hs.add(10);
		hs.add(30);
		hs.add(30);
		hs.add(3,40);
		int firstIndex=hs.indexOf(30);
		System.out.println("First Occurrence: " + firstIndex);
		int LastIndex=hs.lastIndexOf(30);
		System.out.println("Last Occurrence: " + LastIndex);
		
		System.out.println("The ArrayList Elements ");
		System.out.println("Before sorting");
		
		for(Integer  i:hs)

		{
			
			System.out.println(i);
		}
		 Collections.sort(hs);
LinkedList<Integer> ll=new LinkedList<Integer>(hs);
System.out.println("after sorting");
System.out.println("The LinkedList Elements ");

for(Integer i1:ll)
{
	System.out.println(i1);
}

	}

}
