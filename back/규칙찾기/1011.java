import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // fly me
		Scanner sc = new Scanner(System.in);
		long t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			long a = sc.nextInt();
			long b = sc.nextInt();
			long num = b - a;
			boolean flag = false;
			long maxTotal = 0;
			long d = 1;
			long count = 0;

			if (num == 1) {
				System.out.println("1");
			} else {

				for (; maxTotal < num; count++) {
					maxTotal += d;
					if (flag)
						d++;
					flag = !flag;
				}
				System.out.println(count);
			}
		}
	}
}