class Area{
static void fun1()  
{
System.out.println("Area1");
}
static void fun2()
{
System.out.println("Area2");
}


}




class Example{
static void fun1()  // agar ham static nhi lagayenge to yahan par error dega because ham static main function se call kar rahe h
{
System.out.println("A");
}
static void fun2()
{
System.out.println("B");
}

public static void main(String []args)
{
System.out.println("C");
Example.fun1();
fun2();    // static area so static function hi call hoga

Area.fun1();
Area.fun2();
}
}