import java.util.*;
public class thirdlargest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i,m,n,j,r,k,s=0,z,first=-1,second=-1,third=-1;
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
                    third=second;
                    second=first;
                    first=ar[i];
                }
                else if(ar[i]>second && ar[i]!=first)
                {
                    third=second;
                    second=ar[i];
                }
                else if(ar[i]>third && ar[i]!=second && ar[i]!=first)
                {
                    third=ar[i];
                }
            }
            if(third==-1)
            System.out.println("NO THIRD LARGEST ELEMENT");
            else
            System.out.println("THIRD LARGEST ELEMENT IS "+third);
    }
}
