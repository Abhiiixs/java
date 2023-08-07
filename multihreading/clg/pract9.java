class A {
    int m1(){return 1;}
    int m2(){return 2;}
}
class B extends A {
    
    int m1(){return 11;}
    int m2(){return 12;}
    int m3(){return 121;}
    int m4(){return 132;}
}

public class pract9 {
    public static void main(String args[])
    {
        B b = new B();
        System.out.println(b.m1());
        System.out.println(b.m2());
        System.out.println(b.m3());
        System.out.println(b.m4());
    }
}
