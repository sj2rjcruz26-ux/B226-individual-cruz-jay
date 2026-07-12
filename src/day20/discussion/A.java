package day20.discussion;

public class A {

    // variable
    protected String name = "Winter";

    // method 
    protected void printName() {
        System.out.println("Winter");
    }

    public static void main(String[] args) {
        A a = new A();
        a.printName();
    }
}
