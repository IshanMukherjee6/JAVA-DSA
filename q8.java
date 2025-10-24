import java.util.*;
public class q8 {
    public static void main(){
 String str="THE SKY IS BLUE";
 str=str+" ";   
 int l=str.length();
 int c=0,i,j,k;
 String t="";
 for(i=0;i<l;i++)
 {
    if(str.charAt(i)==' ')
    c++;
 }
 String x[]=new String[c+1];
 k=0;
 String w="";
 for(i=0;i<l;i++)
 {
    if(str.charAt(i)!=' ')
    w=w+str.charAt(i);
    else{
        x[k]=w;
        k++;
        w="";
    }
 }
 for(i=0;i<k;i++)
 {
    for(j=0;j<k-i-1;j++)
    {
        if(x[j].compareTo(x[j+1])>0)
        {
            t=x[j];
            x[j]=x[j+1];
            x[j+1]=t;
        }
    }
 }
 System.out.println("SORTED SENTENCE");
 for(i=0;i<k;i++)
 {
    System.out.print(x[i]+" ");
 }
}
}
