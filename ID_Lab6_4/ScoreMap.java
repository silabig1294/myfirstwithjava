package ID_Lab6_4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ScoreMap {
    public static void main(String[] args) {
        Map<String,Integer> score = new HashMap<String,Integer>(); // no order but order follow hash algo 
        score.put("Somlak", 15);//can null 
        score.put("Sila", 26);
        score.put("Samart", 20);
        score.put("Somwang", 20);
        System.out.println(score);
        score.put("Samart", 18);
        System.out.println(score.get("Samart"));
        System.out.println(score.keySet());
        System.out.println(score.values());

        Map<String,Integer> score1 = new Hashtable<String,Integer>();
        score1.put("Somlak", 15);//can not null // data clean
        score1.put("Sila", 26);
        score1.put("Samart", 20);
        score1.put("Somwang", 20);
        System.out.println(score1);
        score1.put("Samart", 18);
        System.out.println(score1.get("Samart"));
        System.out.println(score1.keySet());
        System.out.println(score1.values());

        Map<String,Integer> score2 = new TreeMap<String,Integer>();
        score2.put("Somlak", 15);//sort dictionary
        score2.put("Sila", 26);
        score2.put("Samart", 20);
        score2.put("Somwang", 20);
        System.out.println(score2);
        score2.put("Samart", 18);
        System.out.println(score2.get("Samart"));
        System.out.println(score2.keySet());
        System.out.println(score2.values());

        Map<String,Integer> score4 = new LinkedHashMap<String,Integer>();
        score4.put("Somlak", 15); // FIFO can be Stack Queue
        score4.put("Sila", 26);
        score4.put("Samart", 20);
        score4.put("Somwang", 20);
        System.out.println(score4);
        score4.put("Samart", 18);
        System.out.println(score4.get("Samart"));
        System.out.println(score4.keySet());
        System.out.println(score4.values());

    }
}
