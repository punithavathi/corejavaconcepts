package example;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub,
		
		int [] number={10,20,30,40,50};
		for(int i=0;i<number.length;i++)
		{
			if(number[i]==30)
			{
				continue;
			}
			System.out.print(number[i]);
			System.out.println();
			
			
		}
		

	}

}
