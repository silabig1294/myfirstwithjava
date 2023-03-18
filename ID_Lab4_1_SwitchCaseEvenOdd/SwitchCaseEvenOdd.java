package ID_Lab4_1_SwitchCaseEvenOdd;

/**
 * SwitchCaseEvenOdd
 */
public class SwitchCaseEvenOdd {
   public static void main(String[] args) {
    int num  = 20;

    if(num >= 1 && num <= 20){
        switch(num%2){
            case 0:
                System.out.println(num +" is an Even number");
                break;
            case 1:
                System.out.println(num +" is an Odd number");
                break;
        }
    }
    else{
        System.out.println("Please Enter 1-20 number");
    }
    
   }
}