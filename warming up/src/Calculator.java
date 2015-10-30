import java.util.Scanner;


public class Calculator {

Scanner s=new Scanner(System.in);

	public  void display(int a,int b)
	{
		int c;
		System.out.println("Enter the choice");
		int n=s.nextInt();
		switch(n)
	{
		case 1:
		{
			c=a+b;
			System.out.println("Addition is" + c);
			break;
			
		}
		case 2:
		{
			c=a-b;
			System.out.println("subtraction is" + c);
			break;
		}
		case 3:
		{
			c=a/b;
			System.out.println("division is"  + c);
			break;
			
		}
		case 4:
		{
			c=a%b;
			System.out.println("Modulo is" + c);
			break;
			
		}
	}
	}
		public void display(double a,double b)
		{
			double c;
			System.out.println("Enter the choice");
			int n1=s.nextInt();
			switch(n1)
		{
			case 1:
			{
				c=a+b;
				System.out.println("Addition is" + c);
				break;
				
			}
			case 2:
			{
				c=a-b;
				System.out.println("subtraction is" + c);
				break;
			}
			case 3:
			{
				c=a/b;
				System.out.println("division is" + c);
				break;
				
			}
			case 4:
			{
				c=a%b;
				System.out.println("Modulo is" + c);
				break;
				
			}
		}
		
		
		
		}
	

	
		
		

public static void main(String[] args) {
	
	Calculator c= new Calculator();
	Calculator c1=new Calculator();
	c.display(20,30);
	c1.display(30.0,40.0);
	
	
}

}

