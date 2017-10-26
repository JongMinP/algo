import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // �γ�ȸ��

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {

			int k = sc.nextInt(); // k��
			sc.nextLine();
			int n = sc.nextInt(); // nȣ
			sc.nextLine();
			int total = 0;
			int[][] floor = new int[k + 1][n + 1];
			for (int i = 1; i <= n; i++) {
				floor[0][i] = i;
			}

			for (int i = 1; i <= k; i++) {
				for (int j = 1; j <= n; j++) {
					for (int q = 1; q <= j; q++) {
						floor[i][j] += floor[i - 1][q];
					}
				}
			}

			for (int i = 1; i <= n; i++) {
				total += floor[k - 1][i];
			}
			System.out.println(total);

		}

	}

}