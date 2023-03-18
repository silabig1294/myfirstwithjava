package ID_Lab5_4;

import java.io.IOException;
import java.util.Scanner;

/**
 * Test_Try_Catch
 */
public class Test_Try_Catch {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input your name: ");
        String str = sc.next();

        System.out.println("Hello "+str);

        System.out.println("Please input your birthday(25xx): ");
        String input = sc.next();
        try{
            int newnum;
            int num = Integer.parseInt(input);
            newnum = num-543;
            System.out.println("you birth in year "+num+" in buddhist era and in chist era year "+newnum);
        }
        catch(NumberFormatException ee){
            System.out.println("Incorrect input");
        }
        
    }
    
}