class Staticvar
{
    int x = 10;
    void display()
    {
        System.out.println(x);
    
    }
}
class Demo12
{
    public static void main(String[] args)
    {
        Staticvar obj1 = new Staticvar();
        Staticvar obj2 = new Staticvar();
        ++obj1.x;
        obj1.display();
        obj2.display();
    }
}