import java.util.*;
public class reversearray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,i,k=0;
        System.out.println("ENTER THE SIZE OF ARRAY");
        n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("ENTER THE NUMBERS IN THE ARRAY");
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("REVERSED ARRAY:");
        for(i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
