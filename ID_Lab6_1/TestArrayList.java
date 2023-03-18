package ID_Lab6_1;

import java.util.*;

public class TestArrayList {
    public static void main(String[] args) {
        String[] str = new String[3];//fix array
        str[0] = "Sila";
        str[1] = "David";
        str[2] = "Mar";

        ArrayList<String> arrList;
        arrList = new ArrayList<String>();
        arrList.add("Sila");
        arrList.add("David");
        arrList.add("Mar");

        int i;
        for(i=0;i<str.length;i++){
            System.out.println("name no"+(i+1)+": "+str[i]);
        }
        System.out.println("number of String Array = "+str.length+" can't add more name");
        //str[3] = "Somwan";

        for(String s : arrList)
            System.out.println(s);
        
        System.out.println("number of String Array List = "+arrList.size());
        arrList.add("Somwan");
        for(String s : arrList)
            System.out.println(s);
        
        System.out.println("number of String Array List = "+arrList.size());
        System.out.println("number of String Array List = "+arrList.size()+" add more name");
        arrList.remove(3);
        arrList.remove("David");
        System.out.println("number of String Array List = "+arrList.size()+" remove name");
        for(String s : arrList)
            System.out.println(s);
        
        System.out.println("number of String Array List = "+arrList.size());
        arrList.remove(1);
        for(String s : arrList)
            System.out.println(s);
        arrList.remove(0);
        for(String s : arrList)
            System.out.println(s);
        System.out.println("number of String Array List = "+arrList.size());
    }
    
}
