class Wrapper1
{
    // public static void main(String[] args)
    // {
    //     int i=100;
    //     Integer j= Integer.valueOf("10110",2);
    //     Integer  k = i;
    //     Double l = Double.valueOf(56);
    //     System.out.println(l);
    //     System.out.println(i);
    //     System.out.println(j);
    //     System.out.println(k);
    // }
    int instvar;
    Wrapper1()
    {
        System.out.println("The keyword this is = "+this);
    }
    public static void main(String[] args)
    {
        Wrapper1 r1 = new Wrapper1();
        System.out.println("The value of object is=" +r1);
    }
}