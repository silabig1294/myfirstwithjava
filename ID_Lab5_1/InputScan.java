package ID_Lab5_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * InputScan
 */
public class InputScan {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input your name: ");
        String str = sc.nextLine();

        System.out.println("Hello "+str);

        System.out.println("Please input your birthday(25xx): ");
        String input = sc.next();

        int newnum;
        int num = Integer.parseInt(input);
        newnum = num-543;
        System.out.println("you birth in year "+num+" in buddhist era and in chist era year "+newnum);

        System.out.println("You new input");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println("your String = "+s);

        
    }
}