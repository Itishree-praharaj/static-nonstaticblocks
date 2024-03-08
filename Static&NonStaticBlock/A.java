public class A {
    static int i;
    static{
        System.out.println("Static block");
    } 
    static{
        i=10;
        System.out.println("static var "+i);
    }
    static void m1(){
        System.out.println("Static method");
        System.out.println(i);
    }   
}
class Test1{
    public static void main(String[] args) {
        System.out.println("Main Starts");
        A.m1();
        A.m1();
    }
}
