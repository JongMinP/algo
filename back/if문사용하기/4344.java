import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // ����� �Ѱ���
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); // �׽�Ʈ ���̽�

		sc.nextLine();

		while (t-- > 0) {

			int n = sc.nextInt(); // �л���

			int[] num = new int[n];

			int count = 0; // ��� �Ѵ� �л�
			
			for(int i=0; i < n; i++){
				num[i] = sc.nextInt();
			}

			int average = (int) Arrays.stream(num).average().orElse(0); // ���

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