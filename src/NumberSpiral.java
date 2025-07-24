import java.util.Arrays;
import java.util.Scanner;

public class NumberSpiral {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] wei=new int [n];
        for(int i=0;i<n;i++) wei[i]=sc.nextInt();
        int [] cost=new int [n];
        for(int i=0;i<n;i++) cost[i]=sc.nextInt();
        int [] happ=new int [n];
        for(int i=0;i<n;i++) happ[i]=sc.nextInt();
        int minh=sc.nextInt();
        int maxc=sc.nextInt();
        int [][][] dp=new int [n][maxc+1][minh+1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=maxc;j++)
            {
                Arrays.fill(dp[i][j],-1);
            }
        }
        int totalcost=helper(wei,cost,happ,minh,maxc,n-1,0,dp);
        System.out.print(totalcost);
    }

    private static int helper(int[] wei, int[] cost, int[] happ, int minh, int tar, int i,int happy,int [][][] dp) {
        if(happy>=minh) return 0;
        if(i<0)
        {
            return Integer.MAX_VALUE;
        }
        if(dp[i][tar][happy]!=-1) return dp[i][tar][happy];
        int pick=Integer.MAX_VALUE;
        if(tar>=wei[i])
        {

            pick=helper(wei,cost,happ,minh,tar-wei[i],i,Math.min(happy+happ[i],minh),dp);
            if(pick!=Integer.MAX_VALUE) pick+=cost[i];
        }
        int notpick=helper(wei,cost,happ,minh,tar,i-1,happy,dp);

        return dp[i][tar][happy]=Math.min(pick,notpick);
    }


}
