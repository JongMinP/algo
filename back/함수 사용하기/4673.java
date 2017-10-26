public class Main { // 셀프넘버

	public static void main(String[] args) {

		int[] d = new int[10001];

		for (int i = 1; i < 10001; i++) {
			int a = i; // 처음 숫자
			String s = String.valueOf(a);

			for (int j = 0; j < s.length(); j++) {
				a += s.charAt(j) - '0';
			}
			if (a <= 10000)
				d[a] = 1;
            
            if (d[i] != 1)
				System.out.println(i);
		}
	}

}