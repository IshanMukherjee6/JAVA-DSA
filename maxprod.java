import java.util.*;
public class maxprod {
public static void main()
{
    Scanner in=new Scanner(System.in);
    int p,n,i;
    System.out.println("ENTER SIZE OF ARRAY");
    n=in.nextInt();
    int ar[]=new int[n];
    System.out.println("ENTER THE ARRAY ELEMNETS");
    for(i=0;i<n;i++)
    {
        ar[i]=in.nextInt();
    }
  int a=Integer.MIN_VALUE; int b= Integer.MIN_VALUE; int c=Integer.MIN_VALUE;int d=Integer.MAX_VALUE;
  int e=Integer.MAX_VALUE;
for(i=0;i<n;i++)
{
   if(ar[i]>a)
   {
    c=b;
    b=a;
    a=ar[i];
   }
   else if(ar[i]>b)
   {
    c=b;
    b=ar[i];
   }
   else if(ar[i]>c)
   {
    c=ar[i];
   }
   if(ar[i]<d)
   {
    e=d;
    d=ar[i];
   }
   else if(ar[i]<e)
   {
    e=ar[i];
   }
}
int q=Math.max(a*b*c, a*d*e);
System.out.println("MAX PROD="+q);
}    
}
