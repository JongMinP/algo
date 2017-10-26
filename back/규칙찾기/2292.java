import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // ¹úÁý

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int i = 1;
		int bang = 1;

		while (true) {

			if (i < n) {
				bang++;
				i = 3 * bang * (bang - 1) + 1;
			} else {
				break;
			}

		}

		System.out.println(bang);

		// 3n(n-1)+1

	}

}
}