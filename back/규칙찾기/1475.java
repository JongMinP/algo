import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // ¹æ¹øÈ£

		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[10];
		String num = sc.nextLine().replace('9', '6');

		for (int i = 0; i < num.length(); i++) {
			int n = num.charAt(i) - '0';
			numbers[n]++;
		}
		
		numbers[6] = numbers[6]/2 + numbers[6]%2;
		
		Arrays.sort(numbers);
		
		System.out.println(numbers[9]);

	}
}