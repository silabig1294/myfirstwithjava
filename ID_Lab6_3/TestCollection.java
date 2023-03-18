package ID_Lab6_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TestCollection
 */
public class TestCollection {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<String>();
        lst.add("Kongrak");
        lst.add("Kongkra");
        lst.add("Kongart");
        lst.add("Kongporn");
        lst.add("Kongporn");
        lst.add("Kongporn");
        lst.add("Kongporn");

        System.out.println(lst);
        Collections.sort(lst);
        System.out.println(lst);

        int i = Collections.binarySearch(lst,"Kongporn");
        System.out.println(i);

    }
}