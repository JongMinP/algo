import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // ���ϱ� ����Ŭ

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // �Է�

		int result = 0;

		int cycle = 0; // ����Ŭ

		result = n;

		while (true) {
			String s;
			if (result < 10) {
				s = "0" + String.valueOf(result);
			} else {
				s = String.valueOf(result);
			}
			int a = s.charAt(0) - '0'; // ���� �ڸ�
			int b = s.charAt(1) - '0'; // �����ڸ�
			String c = String.valueOf(a + b);
			int nextb = c.charAt(c.length() - 1) - '0';// ���� ���� �ڸ�

			result = Integer.parseInt(String.valueOf(b) + String.valueOf(nextb));

			cycle++;

			if (result == n) {
				break;
			}

		}

		System.out.println(cycle);

	}

}