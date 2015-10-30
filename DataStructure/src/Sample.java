import java.util.ArrayList;
import java.util.Iterator;


public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		String punitha="punitha";
		al.add("Lakshmi");
		al.add("punitha");
		al.add("Mangai");
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("malar");
		al1.add("punitha");
		al.remove(2);
		if(al.contains(punitha))
		{
			System.out.println("The punitha is here");
		}
		
		al1.clear();
		if(al1.isEmpty())
		{
			System.out.println("The arraylist is empty");
		}
		
		
		Iterator<String> it=al.iterator();
		
		
		while(it.hasNext())
		{
			String str=it.next();
			System.out.println(str);
		}
		

	}

}
