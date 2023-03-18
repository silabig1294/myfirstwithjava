package ID_Lab6_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ListAndSet {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<String>();
        list.add("Sila");
        list.add("Davika");
        list.add("Sila");
        System.out.println(list);

        Collection<String> set = new HashSet<String>();
        set.add("Sila");
        set.add("Davika");
        set.add("Sila");
        System.out.println(set);
    }
    
}
