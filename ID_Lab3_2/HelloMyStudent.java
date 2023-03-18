//--> Overloading Method and //Overwritting   <==polymophism
package ID_Lab3_2;


public class HelloMyStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.studentInfo();
        s.studentInfo("sila.se");
        s.studentInfo("sila.se",4.00);

    }
}

class Student{
    void studentInfo(){
        System.out.println("Hello! Everybody");
    }
    void studentInfo(String name){
        System.out.println("Hello! "+name);
    }
    void studentInfo(String name, double gpa){
        System.out.println("Hello! "+name+" your Grade "+gpa);
    }
}
