import java.util.*;
public class stockmaxprofit {
public static void main()
{
    Scanner in=new Scanner(System.in);
    int N,i;
    System.out.println("ENTER THE SIZE OF ARRAY");
    N=in.nextInt();
    int prices[]=new int[N];
    System.out.println("ENTER THE PRICES");
    for(i=0;i<N;i++){
        prices[i]=in.nextInt();
    }
    stockmaxprofit ob=new stockmaxprofit();
    int maxprofit=profit(prices);
    System.out.println("MAXIMUM PROFIT AFTER SELLING="+maxprofit);
}
static int profit(int ar[])
{
    int profit=0;
    for(int i=0;i<ar.length;i++)
    {
        for(int j=i+1;j<ar.length;j++)
        {
            int q= ar[j]-ar[i];
            if(q> profit)
            profit=q;
        }
    }
    return profit; 
} 
}
