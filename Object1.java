class Mahesh {

int x;   // instance(object) member variable
int y;   // instance(object) member variable

static int z;

void fun1()         // instance(object) member function
{
System.out.println("fun1");
}
void fun2()         // instance(object) member function
{
System.out.println("fun2");
}

}



class Object1
{
public static void main(String []arg){

System.out.println("Hello");
Mahesh m1 = new Mahesh();
Mahesh m2 = new Mahesh();
m2.x = 51;
System.out.println(m2.x);
m1.fun1();
m1.x = 5;
System.out.println(m1.y); // by default garbage value = 0 in java
System.out.println(m1.x);


Mahesh.z=100;   // calling static variable in different class using class name without creating object
System.out.println(Mahesh.z);
}
}