import java.util.Scanner;

public class Main { // �ܾ��� ����
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] s = sc.nextLine().trim().split(" ");

		if (s[0].matches("")) {
			System.out.println(0);
		} else {
			System.out.println(s.length);

		}
	}

}