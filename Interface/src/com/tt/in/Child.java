package com.tt.in;

public class Child implements Parent {
	
		public void display()
		{
			
			System.out.println("The children class is created");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Child();
		p.display();
		

	}

}
