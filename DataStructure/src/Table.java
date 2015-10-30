import java.util.Hashtable;
import java.util.Map;


public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<Integer,String> map=new Hashtable<Integer,String>();
map.put(1,"pondy");
map.put(2,"tindivanam");
map.put(3,"chennai");
map.put(4,"pondy");
for(Map.Entry<Integer,String> hm:map.entrySet())
{
	System.out.println(hm.getKey()+ " "+hm.getValue());
	

}
	}
}

