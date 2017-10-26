import java.util.Scanner;

public class Main {

	public static void main(String[] args) { //Ä«À×´Þ·Â
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] answer = new int[t];

		while (t-- > 0) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int idx = answer.length - t - 1;

			while (true) {

				if (x == y) {
					answer[idx] = x;
					break;
				}

				if (x > m * n || y > m * n) {
					answer[idx] = -1;
					break;
				}

				if (x < y) {
					x += m;
				} else {
					y += n;
				}
			}
			System.out.println(answer[idx]);
		}
	}
}