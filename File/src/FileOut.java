import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		FileOutputStream fout=new FileOutputStream("D:/punitha/test.txt");
		String s="My college is best";
		byte b[]=s.getBytes();
		fout.write(b);
		

	
fout.close();
System.out.println("sucess");
}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
}
}


