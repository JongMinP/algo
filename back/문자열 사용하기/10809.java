import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		int[] alpa = new int[26];

		for (int i = 0; i < alpa.length; i++)
			alpa[i] = -1;

		for (int i = str.length()-1; i >=0 ; i--) { // 뒤에서부터
			alpa[str.charAt(i) - 'a'] = i;
		}

		for (int i = 0; i < alpa.length; i++) {
			System.out.print(alpa[i] + " ");
		}

	}

}