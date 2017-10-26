import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // 더하기 사이클

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 입력

		int result = 0;

		int cycle = 0; // 싸이클

		result = n;

		while (true) {
			String s;
			if (result < 10) {
				s = "0" + String.valueOf(result);
			} else {
				s = String.valueOf(result);
			}
			int a = s.charAt(0) - '0'; // 십의 자리
			int b = s.charAt(1) - '0'; // 일의자리
			String c = String.valueOf(a + b);
			int nextb = c.charAt(c.length() - 1) - '0';// 다음 일의 자리

			result = Integer.parseInt(String.valueOf(b) + String.valueOf(nextb));

			cycle++;

			if (result == n) {
				break;
			}

		}

		System.out.println(cycle);

	}

}