import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // 문자열 반복

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {

			int r = sc.nextInt();

			String s = sc.next();

			sc.nextLine();

			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				for (int j = 0; j < r; j++) {
					System.out.print(c);
				}
			}
			System.out.println();

		}

	}

}