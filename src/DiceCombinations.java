import java.util.Arrays;
import java.util.Scanner;

public class DiceCombinations {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] dp=new int [n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++)
        {
            int ways=0;
            for(int j=1;j<=6;j++)
            {
                if(i>=j) ways=(ways+dp[i-j])%1_000_000_007;
            }
            dp[i]=ways;
        }
        System.out.println(dp[n]);
    }
}
