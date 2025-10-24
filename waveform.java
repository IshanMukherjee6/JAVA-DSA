import java.util.*;
public class waveform {
public static void main(String Args[])
{
    Scanner in=new Scanner(System.in);
    waveform ob=new waveform();
    System.out.println("ENTER SIZE OF ARRAY");
    int n=in.nextInt();
    int ar[]=new int[n];
    System.out.println("ENTER THE ARRAY ELEMENTS");
    for(int i=0;i<n;i++)
    {
        ar[i]=in.nextInt();
    }
    coco(ar);
    System.out.println("WAVEFORM=");
    for(int vv:ar)
    {
        System.out.print(vv+" ");
    }
}    
static int[] coco(int ar[])
{
    int i;
   for(i=0;i<ar.length;i+=2)
   {
    int left=i;
    int right=Math.min(i+1,ar.length-1);
    while(left<right)
    {
        int temp=ar[left];
        ar[left]=ar[right];
        ar[right]=temp;
        left++;
        right--;
    }
   }
    return ar;
}
}
