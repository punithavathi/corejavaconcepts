
public class TriangleMain extends Triangle {
public void display()
{
	area=height*base/2;
	System.out.println("The triangle area is " + area);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TriangleMain t=new TriangleMain();
t.display();
	}

}
