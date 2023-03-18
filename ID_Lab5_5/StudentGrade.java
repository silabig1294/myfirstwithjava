package ID_Lab5_5;
import java.util.Scanner;
import java.io.*;

public class StudentGrade {
    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(new File("C:/Users/Asus/OneDrive/Desktop/score.txt"));
        int i = 1;
        while(file.hasNext()){
            String id = file.next(),s = "";
            double score = file.nextDouble();
            if(score >= 60.0){
                s = "S";
            }
            else{
                s = "U";
            }
            System.out.println(i++ + ".\t" + id + "\t" + s);
        }
    }
}
