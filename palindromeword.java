import java.util.*;
public class palindromeword {
public static void main()
{
    String str="",wd="",m="";char ch,chr;int i,f=0;
    Scanner in=new Scanner(System.in);
    System.out.println("ENTER THE SENTENCE");
    str=in.nextLine().toUpperCase();
    chr=str.charAt(str.length()-1);
    if(chr=='.'||chr==','||chr=='?'||chr=='!')
    System.out.println("PROGRAM TERMINATED");
    else{
        str=str+" ";
        System.out.println("THE PALINDROME WORDS ARE:");
        for(i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch!=' ')
            {
                wd=wd+ch;
                m=ch+m;
            }
            else{
                if(wd.equalsIgnoreCase(m))
                {
                    System.out.print(wd+" ");
                    f++;
                }
                wd="";m="";
            }
        }
    }
    if(f==0)
    System.out.println("Nil");
}    
}
