import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // 분수찾기
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int j = 2;
		int fir = 1;
		int sec = 1;
		int total = 1;

		while (total < n) {
			if (n == 1) {
				break;
			}
			for (int i = 1; i <= j; i++) {
				if (j % 2 == 0) {
					if (i == 1) {
						sec++;
					} else {
						sec--;
						fir++;
					}
				} else {
					if (i == 1) {
						fir++;
					} else {
						fir--;
						sec++;
					}

				}

				total++;
				if (total == n) {
					break;
				}
			}
			j++;

		}

		System.out.println(fir + "/" + sec);

	}

}