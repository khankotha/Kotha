
abstract class A{
    abstract void m();
}
class B extends A{
    void m(){
        System.out.println("All done");
    }
}

public class khan {
    public static void main(String[] args) {
        B ob = new B();
        ob.m();
    }
}
