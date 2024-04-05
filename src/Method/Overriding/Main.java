package Method.Overriding;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.meth());

        B obj2 = new B();
        System.out.println(obj2.meth());
    }
}