import java.util.*;
public class primeadam {
    public static void main()
    {
    Scanner in=new Scanner(System.in);
    int m,i,n,c=0,r,z=0,a,b,s=0,d,x,y=0,v=0,j,k;
    System.out.println("ENTER THE LOWER LIMIT");
    m=in.nextInt();
    System.out.println("ENTER THE UPPER LIMIT");
    n=in.nextInt();
    if(m>n)
    System.out.println("INVALID INPUT");
    else{
        System.out.println("PRIME_ADAM NUMBERS ARE:");
        for(i=m;i<n;i++)
        {
            c=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                c++;
            }
            if(c==2)
            z++;
        }
        int ar[]=new int[z];
        r=0;
        for(i=m;i<n;i++)
        {
            c=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                c++;
            }
            if(c==2)
            {
                ar[r]=i;
                r++;
            }
        }
        for(i=0;i<ar.length;i++)
        {
            a=ar[i]*ar[i];
            s=0;
            for(j=ar[i];j>0;j/=10)
            {
                b=j%10;
                s=s*10+b;
            }
            d=s*s;
            y=0;
            for(k=d;k>0;k/=10)
            {
                x=k%10;
                y=y*10+x;
            }
            if(a==y)
            {
                v++;
                System.out.println(ar[i]);
            }
        }
        System.out.println("FREQUENCY OF PRIME ADAM INTEGERS:"+v);
    }        
    }
}
