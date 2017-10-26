import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // 숫자의 개수
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		sc.nextLine();
		int b = sc.nextInt();
		sc.nextLine();
		int c = sc.nextInt();
		sc.nextLine();

		int[] num = new int[10];

		String s = String.valueOf(a * b * c);

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < 10; j++) {
				int number = s.charAt(i) - '0';
				if (number == j) {
					num[number] += 1;
				}
			}
		}
		
		for(int i : num){
			System.out.println(i);
		}

	}

}