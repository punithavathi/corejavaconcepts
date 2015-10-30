
public class Constructor {

	
		int id;
		String name;
		int age;
		String address;
		
		public Constructor(int i,String n)
		{
			id=i;
			name=n;

	}
		
		

public Constructor(int i, String n, int a) {
			
			id = i;
			name = n;
			age = a;
		}
public Constructor(int i, String n, int a,String s ) {
	
	id = i;
	name = n;
	age = a;
	address=s;
}
 void display()
{
	System.out.println(id+" "+ name +" " +age+" "+address );
}
public static void main(String[] args) {
	
	
	Constructor c=new Constructor(101,"punitha");
	Constructor c1=new Constructor(102,"Malar",20);
	Constructor c2=new Constructor(102,"Mangai",25,"pondy");
	c.display();
	c1.display();
	c2.display();
	
}
}
	// TODO Auto-generated method stub
