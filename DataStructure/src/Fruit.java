import java.util.HashMap;
import java.util.Map;


public class Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "mango");
		map.put(2, "banana");
		map.put(3, "banana");
		map.put(null,null);
		map.put(4,null);
		map.put(5, null);
		for(Map.Entry<Integer,String> hm : map.entrySet())
		{
			System.out.println(hm.getKey()+   " "+ hm.getValue());
		}
		

	}

}
