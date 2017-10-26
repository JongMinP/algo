import java.util.Scanner;

public class Main { // 그룹체커

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		int[] alpa;
		int count = 0; // 개수
		boolean check;

		sc.nextLine();

		while (t-- > 0) {

			String s = sc.nextLine();

			check = false;

			alpa = new int[26];

			for (int i = 0; i < s.length(); i++) {
				int idx = s.charAt(i) - 'a';

				// 한개이상나오면서, 다음 값이 연속이 아니면
				if (alpa[idx] >= 1 && i != 0 && idx != s.charAt(i - 1) - 'a') {
					check = true;
					break;
				}
				alpa[idx]++;
			}

			if (!check) {
				count++;
			}
		}
		System.out.println(count);

	}

}