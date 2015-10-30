package example;

public class FinaalizeClass {
	protected void finalize()
	{
		System.out.println("this is inside the finalize blk");
	}
	public void display()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FinaalizeClass obj1=new  FinaalizeClass();
		 FinaalizeClass obj2=new  FinaalizeClass();
		 FinaalizeClass obj3=new  FinaalizeClass();
		 obj1=null;
		 System.gc();
		 try{
		
		 obj1.display();
		 
	}
	catch(Exception e){
		System.out.println(e);
		
	}

}
}

