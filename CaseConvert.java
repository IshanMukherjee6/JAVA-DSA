import java.util.*;
public class CaseConvert {
String Str,Ptr;
Scanner in=new Scanner(System.in);
CaseConvert()
{
    Str="";
    Ptr="";
}
void accept()
{
    System.out.println("ENTER THE SENTENCE:");
    Str=in.nextLine().toUpperCase();
}
char shift(char ch)
{
    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    return((char)((int)ch-1));
    else
    return ch;
}
void convert()
{
    int i;
    for(i=0;i<Str.length();i++)
    {
        char ch=Str.charAt(i);
        Ptr=Ptr+shift(ch);
    }
}
void disp()
{
    System.out.println("ORIGINAL SENTENCE="+Str);
    System.out.println("NEW SENTENCE="+Ptr);
}
public static void main(String args[])
{
    CaseConvert ob=new CaseConvert();
    ob.accept();
    ob.convert();
    ob.disp();
}
}
