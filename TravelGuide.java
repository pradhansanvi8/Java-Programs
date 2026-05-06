abstract class P{
    int id;
    abstract void g();
    abstract void s();
}

class B extends P{
    void g(){ id=new java.util.Scanner(System.in).nextInt(); }
    void s(){ System.out.println("Book "+id); }
}

class C extends P{
    void g(){ id=new java.util.Scanner(System.in).nextInt(); }
    void s(){ System.out.println("CD "+id); }
}

public class Main{
    public static void main(String[] a){
        P p;
        p=new B(); p.g(); p.s();
        p=new C(); p.g(); p.s();
    }
}