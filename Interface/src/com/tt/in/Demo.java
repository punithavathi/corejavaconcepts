package com.tt.in;

public class Demo implements  Showable,Printable {
	public void show()
	{
		System.out.println("The show is created");
	}
public void print()
{
	System.out.println("The print is created");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.show();
		d.print();
		

	}

}
