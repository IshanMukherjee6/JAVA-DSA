import java.util.*;
public class secondlargest {
public static void main()
{
    Scanner in=new Scanner(System.in);
    int i,m,n,j,r,k,s=0,z,first=-1,second=-1;
    System.out.println("ENTER NUMBER OF ELEMENTS");
    n=in.nextInt();
    int ar[]=new int[n];
    System.out.println("ENTER THE ELEMENTS");
    for(i=0;i<n;i++)
    {
            ar[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(ar[i]>first)
            {
                second=first;
                first=ar[i];
            }
            else if(ar[i]>second && ar[i]!=first)
            {
                second=ar[i];
            }
        }
        if(second==-1)
        System.out.println("NO SECOND LARGEST ELEMENT");
        else
        System.out.println("SECOND LARGEST ELEMENT IS "+second);
    }    
}
