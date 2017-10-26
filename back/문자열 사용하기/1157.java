import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // 단어 공부
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine().toUpperCase();

		String s = str.toLowerCase();

		int[] alpa = new int[26];
		int max = 0;
		int index = 0;
		int mode = 0;

		for (int i = 0; i < s.length(); i++) {
			int k = s.charAt(i) - 'a';
			alpa[k] += 1;
			if (alpa[k] > max) {
				max = alpa[k];
				index = i;
			}
		}

		for (int i : alpa) {
			if (i == max) {
				mode++;
			}
		}
		
		if(mode ==1){
			System.out.println(str.charAt(index));
		}else {
			System.out.println("?");
		}

	}

}