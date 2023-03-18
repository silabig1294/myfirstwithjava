package ID_Lab4_2_Iteration;

public class TestStar {
    public static void main(String[] args) {
        Star s = new Star();
        s.starTest();
        // Star.starTest();
        // for(int i=1;i<=9;i++){
        //     for(int j=0; j<i ; j++){
        //         System.out.print("*");
        //     }
        //     // System.out.print("*");
        //     System.out.println();
        // }
    }
    
}

class Star{
    public void starTest(){
        for(int i=1;i<=9;i++){
            for(int j=0; j<i ; j++){
                System.out.print("*");
            }
            // System.out.print("*");
            System.out.println();
        }
    }
} 

