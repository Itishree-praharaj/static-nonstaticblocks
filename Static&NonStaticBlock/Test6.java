class H {
    {
        System.out.println("Non static block");
    }

    H() {
        System.out.println("no arg constructor");
    }

    H(int i) {
        this();
        System.out.println("int arg constructor");
    }
}

public class Test6 {
    public static void main(String[] args) {
        new H(10);
    }
}
