package ID_Lab5_3;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Mr.Sila Siangchin";
        System.out.println("Old name is "+name);
        int pos = name.indexOf(' ');
        if (pos != -1){
            name = name.substring(0,pos)
            + " Lee"
            + name.substring(pos);
            System.out.println("New name is "+name);
        }
    }
}
