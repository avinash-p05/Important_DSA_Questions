package testing;

class A{
    A(){
        System.out.println("Constructor testing.A");
    }
    void m1(A a){
        System.out.println("testing.A");
    }
}
class B extends A{
    B(){
        System.out.println("Constructor testing.B");
    }
    void m1(B b) {
        System.out.println("testing.B");
    }
}
class C extends B{
    void m1(C c) {
        System.out.println("testing.C");
    }
}
class D extends C{
    void m1(D d) {
        System.out.println("testing.D");
    }
}


public class testing {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        d.m1(a);
        d.m1(b);
        d.m1(c);
    }
}
