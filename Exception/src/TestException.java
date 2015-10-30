
public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
		
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("The divide  is "+c);
			
		}
		
		
		catch(ArithmeticException e)
		{
			System.out.println("The Arithmetic exception  is occur");
		}
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("The NullPointerException  is occur");
		}
try
{
	String s="abc";
	int n=Integer.parseInt(s);
}
catch(NumberFormatException e)
{
	System.out.println(e);
}
		System.out.println("The exception is occur");
		}
		catch(Exception e)
		{
			System.out.println("the exceptio handled");
		}
	}

}
