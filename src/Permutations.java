import java.util.*;
public class Permutations {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>1 && n<4)
        {
            System.out.println("NO SOLUTION");
            return;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
                sb.append(i+" ");
        }
        for(int i=1;i<=n;i++)
        {
            if(i%2==1) sb.append(i+" ");
        }
        System.out.print(sb.toString());
    }
}
