package example;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World!";
		int h = s.indexOf("W");
		int e = s.indexOf("!");
		
		StringBuffer str = new StringBuffer();
		for (int i = h; i <= e; i++) {
			str.append(s.charAt(i));
		}
		System.out.println(str);
	}

}
