package example;

public class Test {
	// TODO Auto-generated method stub
int rollno;
String name;
int age;

Test(int i,String s)
{
rollno=i;
name=s;
}
Test(int i,String s,int c)
{
rollno=i;
name=s;
age=c;
}
void display()
{
	System.out.println(rollno+ " " + name + " " +age);
}

	public static void main(String[] args) {
		Test t=new Test(101,"Malar");
		Test t1= new Test(102,"Mangai",20);
		t.display();
		t1.display();
		
		

	}

}
