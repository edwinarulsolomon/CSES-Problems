import java.util.*;
public class CoinsCombinationsI {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[s];
        int tar = sc.nextInt();
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[tar + 1];
        dp[0] = 1;
        for (int i = 0; i <= tar; i++) {
            for (int j = 0; j < s; j++) {
                if (i >= arr[j])
                    dp[i] =(dp[i]+dp[i - arr[j]]) % 1_000_000_007;
            }
        }
        System.out.println(dp[tar]);
    }
}
