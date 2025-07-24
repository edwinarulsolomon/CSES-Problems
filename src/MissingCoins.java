import java.io.*;
import java.util.*;

public class MissingCoins {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] coins = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            coins[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(coins);
        long res = 1;
        for (int i = 0; i < n; i++) {
            if (coins[i] > res) break;
            res += coins[i];
        }

        System.out.println(res);
    }
}
