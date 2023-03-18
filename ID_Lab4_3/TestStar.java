package ID_Lab4_3;

public class TestStar {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=0;j<i;j++){
                if(j<4)
                {
                    System.out.print("*");
                    continue;
                }
                else break;
            }
            System.out.println();
        }
    }
}
