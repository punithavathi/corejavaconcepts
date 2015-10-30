import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> hs=new LinkedHashMap<Integer,String>();
		hs.put(1,"chennai");
		hs.put(2,"pondy");
		hs.put(3, "kerla");
		hs.put(1,"pondy");
		hs.put(4,"pondy");
		hs.put(4,null);
		hs.put(null, null);
		hs.put(null, null);
		
		
		for(Map.Entry<Integer,String> hm:hs.entrySet())
		{
			System.out.println(hm.getKey() + " "+hm.getValue());
			}

	}

}
