public class E {
    static{
        System.out.println("Static block");
    }    
    {
        System.out.println("non static block");
    }
    E(){
        System.out.println("Constructor");
    }
}
class Test2{
    public static void main(String[] args) {
        System.out.println("Main starts");
        new E();
        new E();
    }
}
