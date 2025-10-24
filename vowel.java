import java.util.*;
public class vowel
{
    public static void main()
    {
        String str="",wd="",ptr=""; int i, temp=0,t=0,e=0; char ch, chr, c, d;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE SENTENCE");
        str=in.nextLine().toUpperCase();
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            e++;
        }
        String ar[]=new String[e+1];
        str=str+" ";
        chr=str.charAt(str.length()-2);
        if(chr=='.'||chr==','||chr=='?'||chr=='!')
        System.out.println("PROGRAM TERMINATED");
        else
        {
            for(i=0;i<str.length();i++)
            {
                ch=str.charAt(i);
                if(ch!=' ')
                wd=wd+ch;
                else
                {
                    ar[temp]=wd;
                    temp++;
                    wd="";
                }
            }
            for(i=0;i<ar.length;i++)
            {
                c=ar[i].charAt(0);
                d=ar[i].charAt(ar[i].length()-1);
                if((c=='A'||c=='E'||c=='I'||c=='O'||c=='U')&&(d=='A'||d=='E'||d=='I'||d=='O'||d=='U'))
                  {  t++;
                    ptr=ptr+ar[i]+" ";
                    ar[i]="";
                }
            }
            for(i=0;i<ar.length;i++)
            {
                if(!(ar[i].equals("")))
                ptr=ptr+ar[i]+" ";
            }
            System.out.println(t);
            System.out.println(ptr);
        }
    }
}
