package day18.discussion;

public class MethodInvocation {
    
    
    public static void main(String[] args) {
        MethodInvocation obj = new MethodInvocation();
        obj.b();
        a();
    }
    
    //static method
    public static void a(){
        System.out.println("Static Method");
    }
    
    //instance method
    public void b(){
        System.out.println("instance Method");
    }

}
