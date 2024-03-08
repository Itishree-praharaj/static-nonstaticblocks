public class F {
    {
        System.out.println("non static block");
    }
    F(){
        System.out.println("no arg constructor");
    }
    F(int i){
        System.out.println("int arg constructor");
    }    
}
class Test3{
    public static void main(String[] args) {
        new F();
        System.out.println("----------");
        new F(10);
    }
}
