class OBJPASS
{
int a,b,c;
OBJPASS()
{
a=0;
b=0;
}
OBJPASS(int m,int n)
{
a=m;
b=n;
}
public int sum(OBJPASS x)
{
int c;
c=x.a+x.b;
return(c);
}
public static void main(String args[])
{
int r;
OBJPASS ob1=new OBJPASS(15,30);
OBJPASS ob2=new OBJPASS();
r=ob2.sum(ob1);
System.out.println(r);
}
}
