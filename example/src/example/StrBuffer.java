package example;

public class StrBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

StringBuffer str=new StringBuffer("punitha");
 
 System.out.println(str.append("malar"));
 System.out.println(str.insert(2,"mangai"));
 System.out.println(str.delete(2,4));
 System.out.println(str.replace(0,3,"velu"));
 StringBuilder s=new StringBuilder("The insert code successfully");
 System.out.println(s.replace(0,2,"we"));
 System.out.println(s.append( " finished "));
 System.out.println(s.reverse());
 
 
 
 
 


	}

}
