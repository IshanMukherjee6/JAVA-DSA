import java.util.*;
public class ninetydeg {
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int m,i,j,sum=0;
        System.out.println("ENTER THE SIZE OF ARRAY");
        m=in.nextInt();
        if(m>2 && m<10)
        {
            int ar[][]=new int[m][m];
            int br[][]=new int[m][m];
            System.out.println("ENTER THE ARRAY");
            for(i=0;i<m;i++)
            {
                for(j=0;j<m;j++)
                {
                    ar[i][j]=in.nextInt();
                }
            }
            System.out.println("ORIGINAL ARRAY");
            for(i=0;i<m;i++)
            {
                for(j=0;j<m;j++)
                {
                    System.out.print(ar[i][j]+" ");
                }
            System.out.println();
        }
        System.out.println("MATRIX AFTER 90 DEG ROTATION");
        for(i=0;i<m;i++)
            {
                for(j=0;j<m;j++)
                {
                    br[i][j]=ar[j][i];
                }
    }
            for(i=0;i<m;i++)
            {
                for(j=0;j<m;j++)
                {
                    ar[i][m-1-j]=br[i][j];
                }
}
            for(i=0;i<m;i++)
            {
                for(j=0;j<m;j++)
                {
                   System.out.print(ar[i][j]+" ");
                   if((i==0&&j==0)||(i==0&&j==m-1)||(i==m-1&&j==0)||(i==m-1&&j==m-1))
                   sum=sum+ar[i][j];
                }
                System.out.println();
            }
                System.out.println("SUM OF CORNER ELEMENTS="+sum);
        }
        else
        System.out.println("INVALID INPUT");
    }
    }
