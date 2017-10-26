import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // ACM호텔
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {

			StringBuilder sb = new StringBuilder();
			int h = sc.nextInt();
			int w = sc.nextInt();
			int num = sc.nextInt();

			int yy = (num - 1) % h + 1; // 0 ~ 5나오고
			int xx = (num - 1) / h + 1; // 번호

			sb.append(100 * yy + xx);

			System.out.println(sb.toString());

		}

	}

}