package ID_Lab4_4;

public class DisplayArray {
    public static void main(String[] args) {
        int a[] = {23,16,27,32,19};
        System.out.println("Values of array left to right are: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Values of array from right to left are:");
        for(int i=a.length-1 ;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
