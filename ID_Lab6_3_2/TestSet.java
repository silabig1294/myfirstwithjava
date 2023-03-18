package ID_Lab6_3_2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        set1.add("Somying");
        set1.add("Sommai");
        set1.add("Somwang");
        set1.add("Somyang");
        System.out.println(set1);

        Set<String> set2 = new LinkedHashSet<String>(); //FIFO
        set2.add("Somying");
        set2.add("Sommai");
        set2.add("Somwang");
        set2.add("Somwang");
        System.out.println(set2);

        Set<String> set3 = new TreeSet<String>();//order A-Z
        set3.add("Somying");
        set3.add("Sommai");
        set3.add("Somwang");
        set3.add("Somwang");
        System.out.println(set3);
    }
    
}
