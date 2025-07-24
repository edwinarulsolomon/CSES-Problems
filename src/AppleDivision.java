import java.util.*;

public class AppleDivision {
    static long minDiff = Long.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            total += arr[i];
        }

        dfs(arr,0,0,total);
        System.out.println(minDiff);
    }

    public static void dfs(long[] arr, int i, long currSum, long total) {
        if (i == arr.length) {
            long otherSum = total - currSum;
            minDiff = Math.min(minDiff, Math.abs(currSum - otherSum));
            return;
        }
        dfs(arr, i + 1, currSum + arr[i], total);
        dfs(arr, i + 1, currSum, total);
    }
}