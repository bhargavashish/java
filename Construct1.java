class Demo{
    int x,y,z,a;
    Demo(int p,int q)
    {
        x=p;
        y=q;
        System.out.println(x);
        System.out.println(y);
    }
    Demo(int f)
    {
     z=f;
     System.out.println(z);
    }
    Demo()
    {
     a=0;
     System.out.println(a);
    }
}
class Construct1
{
    public static void main(String args[])
    {
        Demo d1=new Demo(5,7);
        Demo d2=new Demo(9,6);
        Demo d3=new Demo(10);
        Demo d4=new Demo();
        
    }
}