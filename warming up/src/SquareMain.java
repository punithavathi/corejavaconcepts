
public class SquareMain extends Square {
	int area;
public void display()
{
	area=side*side;
	System.out.println("The square of area is" + " " +area);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareMain s=new SquareMain();
		s.display();
		

	}

}
