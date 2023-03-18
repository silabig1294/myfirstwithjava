package ID_Lab2_1;
// sila test
public class Ex5_Lab2_1 {
    public static void main(String[] args) {
        System.out.println("SilaSololist");
        B.Hello();

        C s = new C();
        System.out.println(s.sila);
        C.Java();
    }
}
class B {
    static void Hello(){
        System.out.println("Love in Class B");
    }
}
class C {
    String sila = "sila siangchin";
    static void Java(){
        System.out.println("Java Programming in Class C");
    }

}
