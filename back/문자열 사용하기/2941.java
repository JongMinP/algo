import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // ũ�ξ�Ƽ��

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		for (int i = 0; i < croatia.length; i++) {
			s = s.replace(croatia[i], " ");
		}

		System.out.println(s.length());

	}

}