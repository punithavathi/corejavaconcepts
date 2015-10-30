package com.tt.in;

public class Bike1  extends Bike{
	void run()
	{
		System.out.println("Honda is superb bike");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike1 b=new Bike1();
Bike b1=new Bike();
b1.run();
b.run();
	}

}
