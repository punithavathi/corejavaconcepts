package example;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int number[]={10,20,30,40,50};
			for(int i=0;i<number.length;i++)
				if(number[i]==40)
				{
					System.out.println(i);
					
					
				}
		}
catch(ArrayIndexOutOfBoundsException e)
		{
	System.out.println(e);
	
		}
		finally
		{
			System.out.println("The excuted sucesfully");
		}
	}
	

}
