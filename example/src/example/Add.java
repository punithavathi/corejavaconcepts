package example;

public class Add {
	Add()
	{
		System.out.println("The number is added");
	}
	Add(int a,int b)
	{
		 int c=a+b;
		System.out.println(c);
		
	}
	Add(double a,double b,double c)
	{
		double d=a+b+c;
		System.out.println(d);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a=new Add();
		
		Add a1=new Add(10,20);
		Add a2=new Add(20.0,30.0,40.0);
		

	}

}
