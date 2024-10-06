class Nokia
{
    private int mic;
    private int cam;
    void setValue()
    {
     mic=2;
     cam=40;
    }
    void display()
    {
    System.out.println(mic);
    System.out.println(cam);
    }
}
class ClassesAndObject
{
    public static void main(String [] agrs)
    {
     Nokia n1 = new Nokia();
     n1.display();   // output 0 0
     n1.setValue();
     n1.display(); // output 2 40
    }
}