import java.io.FileInputStream;


public class FileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	FileInputStream fin=new FileInputStream("D:/Mangai/sss.txt");
	String s="punitha";
	String s1="punitha";
	if(s.equals(s1))
	{
		System.out.println("The string is equals");
	}
	else
	{
		System.out.println("The string is not equals");
	}
	fin.close();
	
}
catch(Exception e)
{
	System.out.println(e);
}
	}

}
