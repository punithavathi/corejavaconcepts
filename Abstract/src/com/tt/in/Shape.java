package com.tt.in;

public  abstract class Shape {
abstract void draw();
class Rectangle extends  Shape
{
	void draw()
	{
		System.out.println("Rectangle is created");
	}
}

}
