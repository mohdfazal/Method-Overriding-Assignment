package Method.Overriding;

public class A {
    public static String meth(){
       return  "Invoking method from class A";
    }
}
class B extends A{
    public static String meth(){
        return "Method is overridden in Extended class B";
    }
}