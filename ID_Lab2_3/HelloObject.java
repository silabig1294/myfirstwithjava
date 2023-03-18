//Created by Sila Siangchin
package ID_Lab2_3;

public class HelloObject {
    public static void main(String[] args) {
        Greeting.greet1();
        Greeting obj = new Greeting();
        obj.greet2();
    }
    
}
class Greeting{
    static void greet1(){
        System.out.println("Hi,I'm static in greet1");
    }
    void greet2(){
        System.out.println("Hi, I am big in greet2");
    }
}
