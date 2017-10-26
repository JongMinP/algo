import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // »ó¼ö
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");
		int[] num = new int[2];
		StringBuilder sb;

		for (int i = 0; i < s.length; i++) {
			sb = new StringBuilder();
			sb.append(s[i]);
			num[i] = Integer.parseInt(sb.reverse().toString());
		}

		System.out.println(num[0] > num[1] ? num[0] : num[1]);

	}

}