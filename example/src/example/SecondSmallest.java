package example;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// TODO Auto-generated method stub
int array[] = { 78, 45, 7, 100, 1, 6, 4 };
int firstSmall = array[0], secondSmall = array[1];
// System.out.println(array.length);
for (int i = 2; i < array.length; i++) {
System.out.println(array[i]);
System.out.println(firstSmall);
System.out.println(secondSmall);
if (array[i] < firstSmall) {
// System.out.println(array[i]);
secondSmall = firstSmall;
firstSmall = array[i];
// System.out.println(secondSmall+firstSmall);
} else if (array[i] < secondSmall) {
// System.out.println(array[i]);
if (array[i - 1] < array[i]) {
firstSmall = array[i - 1];
}
secondSmall = array[i];
}
}
System.out.println("secondSmall " + secondSmall);
System.out.println("firstSmall " + firstSmall);
}

}

