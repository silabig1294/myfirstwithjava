//created by sila siangchin
package ID_Lab2_4;


public class HelloMethod {
    static String a = "bigbig"; //attribute
    static void greet(String n){
        System.out.println("Hello! "+n);
    }
    public static void main(String[] args) {
        
        String name = "Sila.se";
        greet(name);
        System.out.println(a); 
        System.out.println(Greeting.b); 
        Greeting.greet1();
        Greeting obj_greet = new Greeting();
        obj_greet.greet2();
        obj_greet.greet3();
        Greeting.greet4();
        Greeting obj_greet5 = new Greeting();
        obj_greet5.greet5(name);
        Greeting.greet6(name);
    }
}
class Greeting{
    static String b = "bigbok";
    static void greet1(){
        System.out.println("Hello! I'm static in greet1");
    }
    void greet2(){
        System.out.println("Hello! I'm se.sila in greet2");
    }
    String greet3(){
        System.out.println("Hello!! silabigbig_world");
        return "greet3 OK";
    }
    static String greet4(){
        System.out.println("Say 555 greet4___lol");
        return "greet4 OK";
    }
    String greet5(String name){
        System.out.println("Hello!! silabigbig_world greet5 name:"+name);
        return "greet5 OK";
    }
    static String greet6(String name){
        System.out.println("Say 555 greet6___lol"+name);
        return "greet6 OK "+name;
    }

}
