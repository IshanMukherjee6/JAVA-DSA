import java.util.*;
public class smallint {
public static void main()
{
    Scanner in=new Scanner(System.in);
    int m,n,i,a,s=0,b,c=0;
    System.out.println("ENTER M");
    m=in.nextInt();
    System.out.println("ENTER N");
    n=in.nextInt();
    if(n<100 && m>=100 && m<=10000)
    {
        for(i=m+1;i<=10000;i++)
        {
            b=i;
            c=0;
            s=0;
        while(b!=0)
        {
            a=b%10;
            s=s+a;
            c++;
            b=b/10;
        }
        if(s==n)
        break;
    }
    System.out.println("THE REQUIRED NUMBER IS:"+i);
    System.out.println("TOTAL NUMBER OF DIGITS:"+c);
}
else 
System.out.println("INVALID INPUT");
}    
}
