import java.util.Scanner;

public class Main { // ox 퀴즈

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		sc.nextLine();

		while (t-- > 0) {
			String str = sc.nextLine();

			int count = 0;// 연속게이지
			int score = 0;

			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if( c == 'O'){
					count++;
					score += count;
				}else{
					count = 0;
				}
			}
			
			System.out.println(score);

		}

	}
}