import java.util.*;
public class arraybi {
public static void main()
{
    Scanner in=new Scanner(System.in);
    int i,m,n,j,r,k,s=0,z;
    System.out.println("ENTER NUMBER OF ROWS");
    m=in.nextInt();
    System.out.println("ENTER NUMBER OF COLUMNS");
    n=in.nextInt();
    if((m>0 && m<10) &&(n>2 && n<6))
    {
        int ar[][]=new int[m][n];
        for(i=0;i<m;i++)
        {
            System.out.println("ENTER VALUES FOR ROW"+(i+1));
            for(j=0;j<n;j++)
            {
                ar[i][j]=in.nextInt();
            }
        }
        int br[]=new int[m];
        z=m-1;
        for(i=0;i<m;i++)
        {
            s=0;
            r=n-1;
            for(j=0;j<n;j++)
            {
                s=s+ar[i][j]*(int)(Math.pow(2,r));
                r--;
            }
            br[z--]=s;
        }
        System.out.println("FILLED MATRIX\t\tDECIMAL EQUIVALENT");
        k=m-1;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(ar[i][j]+"\t");
            }
            if(br[k]!=0)
            System.out.println(br[k]);
            System.out.println();
            k--;
        }
    }
    else{
        System.out.println("OUT OF RANGEEEEEEEE");
    }
}
}
