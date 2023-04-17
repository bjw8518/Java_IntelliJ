package ch_06;
//Method    //function
public class _01_Method {
    //method define
    public static void sayHello(){
        System.out.println("Hello method");
    }




    public static void main(String[] args) {
        //method call
        System.out.println("before method call");
        sayHello(); //into method
        sayHello(); //into method
        sayHello(); //into method
        System.out.println("after method call");
    }
}
