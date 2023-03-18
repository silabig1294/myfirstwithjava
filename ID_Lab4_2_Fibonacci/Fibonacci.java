package ID_Lab4_2_Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int k;
        System.out.println(i);
        System.out.println(j);
        k = i+j;
        while(k < 30){
            k = i+j;
            System.out.println(k);
                i = j;
                j = k;
        }
        // do{
        //     k = i+j;
        //     System.out.println(k);
        //     i = j;
        //     j = k;
        // }while(k<30);
    }
    
    
}
