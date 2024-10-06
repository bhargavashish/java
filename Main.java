class A{
    void display()
    {
        System.out.println("We are in class A");

    }
}
class B extends A{
   void display()
   {
    System.out.println("We are in class B");
   }
   void show()
   {
    super.display();
   }
   void display1()
   {
     display();
   }
}
class Main{
    public static void main(String[] args)
    {
     A obj1 = new A();
     B obj2 = new B();
        obj1.display();
        obj2.display();
        obj2.show();
        obj2.display1();
    }
}