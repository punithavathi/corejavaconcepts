
public class MultiplicationTable {

	
		// TODO Auto-generated method stub
		public void print(int n)
		
		{
			for(int i=1;i<=10;i++)
			{
				 int result=n*i;
				System.out.println(n+"*"+i+" = "+(n*i));
			}
			
		}
		public static void main(String[] args) {
			MultiplicationTable m=new 	MultiplicationTable();
			m.print(1);

	}

}
