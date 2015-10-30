package com.adpatvant.in;

class Vechile
{
	
	Vechile()
	{
		System.out.println("The honda bike speedlimit is high ");
	}
}
public class Bike extends Vechile {
	Bike()
	{
		super();
		System.out.println("Bike is created");
	}

	public static void main(String[] args) {
		Bike b=new Bike();
		
	}

}

