package Class1;

public class Temper1 {
    public static void main(String[] args) {
        method2("begin");
    }
    public static void method1(String str){
        System.out.println("method1....");
        System.out.println(str);
    }
    public static void method2(String str){
        System.out.println("method2....");
        method1(str);
    }
}
