import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();

al.add("punitha");
al.add("malar");
al.add("mangai");
Iterator<String> itr1=al.iterator();
{
	while(itr1.hasNext())
	{
		System.out.println(itr1.next());
	}
}
Map<Integer,ArrayList> map=new HashMap<Integer,ArrayList>();
map.put(1,al);
map.put(2,al);
map.put(3, al);
for(Map.Entry<Integer, ArrayList> mm:map.entrySet())
{
	System.out.println(mm.getKey());
	Iterator<String> itr=al.iterator();
	{
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
}


	}

}
