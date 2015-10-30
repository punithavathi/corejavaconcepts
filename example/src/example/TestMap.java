package example;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(1, "puni");
		lhm.put(2, "mangai");
		lhm.put(3, "malar");
		for(Map.Entry<Integer,String> hm:lhm.entrySet()){
			System.out.println(hm.getKey() +" " +hm.getValue());
			
		}
		
		
		

	}

}
