import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // 별찍기

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		starPrint(n);
	}

	public static void starPrint(int line) {
		int n = line;
		int k, m, i, j;
		int height;

		k = (int) (Math.log(n / 3) / Math.log(2) + 1);
		
		String[] arr = new String[n];

		arr[0] = "  *  ";
		arr[1] = " * * ";
		arr[2] = "*****";
		height = 3;
		
		for(i =1; i< k; i++){ // 6부터 실행
			for(j=0; j<height; j++){
				arr[height+j] = arr[j]+" "+arr[j];
				for(m=0; m<height/3;m++){
					arr[j] = "   " + arr[j]+"   ";
				}
			}
			height = 2 * height;
		}
		
		for(i = 0; i<height; i++){
			System.out.println(arr[i]);
		}
		

	}

}