package example;

public class FinalClass {
  static int number=10;
String name="malar";
public final void display()
{
	System.out.println(number + " "+ name);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FinalClass f=new FinalClass();
f.display();
	}

}
