package com.adpatvant.in;

public class Add {
public void sum(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}
public void sum(double a,double b)
{
	double c=a/b;
	System.out.println(c);
	
}
public void sum(float a,float b)
{
	float c=a*b;
	System.out.println(c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a=new Add();
		a.sum(10,10);
		a.sum(30.0,40.0);
		a.sum(.5,.4);
		

	}

}
