import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;


public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String> hs=new TreeMap<Integer,String>();
hs.put(1,"chennai");
hs.put(2,"pondy");
hs.put(3, " kerla");
hs.put(4,"pondy");
hs.put(3,null);
for(Map.Entry<Integer,String> hm:hs.entrySet())
{
	System.out.println(hm.getKey() + " "+hm.getValue());
	}
	}

}
