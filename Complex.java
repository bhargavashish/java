class Complex
{
    int a,b;
    Complex(int i,int j)
    {
        a=i;
        b=j;
    }
    Complex(int i)
    {
        this(i,i);

    }
    Complex()
    {
        this(4);
    }
    void display()
    {
        System.out.println(a+" "+b);
    }
    public static void main(String[] args)
    {
        Complex c1 = new Complex(2,3);
        Complex c2 = new Complex(2);
        Complex c3 = new Complex();
        c1.display();
        c2.display();
        c3.display();
    }
}