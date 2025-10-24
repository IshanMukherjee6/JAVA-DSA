import java.util.*;
public class numberarray {
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i; long s=0;
        System.out.println("ENTER THE SIZE OF ARRAY");
        int n=in.nextInt();
        int ar[]=new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS");
        for( i=0;i<n;i++)
        {
            ar[i]=in.nextInt();
        }
        int v=n-1;
        for(i=0;i<n;i++)
        {
            s=s+ (long) (ar[i]*Math.pow(10,v--));
        }
        System.out.println(s+1);
    }
}
