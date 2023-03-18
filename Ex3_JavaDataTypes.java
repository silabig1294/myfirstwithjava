// Sila Examples
public class Ex3_JavaDataTypes {
    public static void main(String[] args) {
        byte numByte = 127; //-128 to 127 -->  1 byte
        short numShort = 32767; // -32768 to 32767 --> 2 byte
        int score = 90; // -2147483648 to 2147483647 --> 4 byte
        long numLong = 922337203685477L;// 8 byte
        float gravity = 9.8f,numFloat = 26e3f; // numfloat=26000, 6 to 7 decimal 4 byte
        double golden_ratio = 1.6180033988d; //8 byte
        char grade = 'A',gradeB = 66;//Ascii code 66 = B , '' single code , 2byte
        boolean answer = true; //true or false --> 1 bit 
        String name =  "Aj.Big";
        String text = "\"I love Java Programming\"";
        String file = "D:\\Work_Project\\Java";
        System.out.println(score);
        System.out.println(gravity);
        System.out.println(golden_ratio);
        System.out.println(grade);
        System.out.println(numFloat);
        System.out.println(gradeB);
        System.out.println("byte: "+numLong+" short: "+numShort+" long: "+numLong);
        System.out.println(numByte);
        System.out.println(answer);
        System.out.println(name+text+file);

    }
    
}
