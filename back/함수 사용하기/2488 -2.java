import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main { // º°Âï±â

   char[][] star;

   public static void main(String[] args) throws IOException {
      new Main4().run();
   }

   void run() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int n = Integer.parseInt(br.readLine());
      star = new char[n][n * 2];

      for (int i = 0; i < n; i++) {
         Arrays.fill(star[i], ' ');
      }

      dp(n, 0, n - 1);

      for (int i = 0; i < n; i++) {
         sb.append(star[i]).append("\n");
      }
      System.out.println(sb.toString());
   }

   void dp(int n, int x, int y) {
      if (n == 3) {
         star[x][y] = '*';
         star[x + 1][y - 1] = '*';
         star[x + 1][y + 1] = '*';
         star[x + 2][y - 2] = '*';
         star[x + 2][y - 1] = '*';
         star[x + 2][y] = '*';
         star[x + 2][y + 1] = '*';
         star[x + 2][y + 2] = '*';
         return;
      }
      if (n > 3) {
         int tmp = n / 2;
         dp(tmp, x, y);
         dp(tmp, x + tmp, y - tmp);
         dp(tmp, x + tmp, y + tmp);
      }
   }

}