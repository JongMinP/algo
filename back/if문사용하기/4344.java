import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // 평균은 넘겟지
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); // 테스트 케이스

		sc.nextLine();

		while (t-- > 0) {

			int n = sc.nextInt(); // 학생수

			int[] num = new int[n];

			int count = 0; // 평균 넘는 학생
			
			for(int i=0; i < n; i++){
				num[i] = sc.nextInt();
			}

			int average = (int) Arrays.stream(num).average().orElse(0); // 평균

			for (int i : num) {
				if (i > average) {
					count++;
				}
			}
			System.out.printf("%.3f%s",(double)count / n * 100,"%");
			System.out.println();

		}

	}

}