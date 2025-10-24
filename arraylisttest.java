import java.util.*;
public class arraylisttest{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<Integer>();
        int m,n,i,c=0;
        System.out.println("ENTER THE LOWER LIMIT");
        m=in.nextInt();
        System.out.println("ENTER THE UPPER LIMIT");
        n=in.nextInt();
        if(m>n)
        System.out.println("INVALID INPUT");
        else{
            for(i=m;i<=n;i++)
            {
                c=0;
                for(int j=1;j<=i;j++)
                {
                    if(i%j==0)
                    c++;
                }
                if(c==2)
                al.add(i);
            }
            System.out.println("PRIME NUMBERS ARE:");
            for(int k:al)
            System.out.print(k+" ");
        }
    }
}
