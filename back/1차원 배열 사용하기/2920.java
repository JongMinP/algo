import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // À½°è

		Scanner sc = new Scanner(System.in);

		String result = "";

		String s = sc.nextLine().replaceAll(" ", "");

		int n = Integer.parseInt(s);

		s = n == 12345678 ? "ascending" : n == 87654321 ? "descending" : "mixed";

		System.out.println(s);

	}

}