package example;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,2,3,4,5};
		System.out.println("The enter the even number is");
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				
				
		System.out.println( num[i]);
			}
		}
		System.out.println("The enter the odd number is");
	for(int j=0;j<num.length;j++)
	{
		if(num[j]%2!=0)
		{
			System.out.println(num[j]);
		}
	}
	}
}
			