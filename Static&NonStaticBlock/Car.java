class Car {
    int regNum;
    String color;
    private static int num=1000;
    {
        regNum=num++;
    }
    Car(){
        color="White";
    }
    Car(String c){
        color=c;
    }
}
class Test5{
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Black");
        System.out.println(c1.regNum);
        System.out.println(c1.color);
        System.out.println("------------------");
        System.out.println(c2.regNum);
        System.out.println(c2.color);
    }
}
