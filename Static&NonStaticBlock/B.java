public class B {
    public static void main(String[] args) {
        System.out.println("Main of B");
        C.main(null);
    }
}

class C {
    public static void main(String[] args) {
        System.out.println("Main of C");
    }
}
