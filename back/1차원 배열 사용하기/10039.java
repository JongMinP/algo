import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) { // Æò±Õ Á¡¼ö

		Scanner sc = new Scanner(System.in);

		int[] score = new int[5];

		for (int i = 0; i < score.length; i++) {
			int a = sc.nextInt();
            score[i] = a <40 ? 40 : a;
			sc.nextLine();
		}

		System.out.println((int)Arrays.stream(score).average().orElse(0));

	}

}