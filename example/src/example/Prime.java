package example;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 3, 5, 6, 9, 10, 11 };

		int n, p = 0, h = 0, z = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= arr[i]; j++) {
				p = 0;
				for (int k = 2; k < (j / 2); k++) {
					if (j % k == 0) {
						p = 1;
					}

				}

			}
			if (p == 0) {
				System.out.println(arr[i]);
				h += arr[i];
				z++;

			}

		}
		System.out.println(h / z);

	}

}