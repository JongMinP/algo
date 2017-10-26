import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // 한수

		// 등차수열 a + (n-1)d

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (i >= 1 && i <= 99) {
				count = i;
			} else {

				String s = String.valueOf(i);
				int a = s.charAt(0) - '0';
				int b = s.charAt(1) - '0';

				if (s.charAt(2) - '0' == a + 2 * (b - a)) {
					count++;
				}
			}
		}

		System.out.println(count);
	}
}