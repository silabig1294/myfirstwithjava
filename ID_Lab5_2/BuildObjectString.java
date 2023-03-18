package ID_Lab5_2;

public class BuildObjectString {
    public static void main(String[] args) {
        StringBuffer word = new StringBuffer("Sawasdee Thailand");
        System.out.println(word);
        word.replace(9,word.length(),"CE61299 : OOP");
        System.out.println(word);
        String name = "Silpakorn university";
        String newname = name.substring(0,10)+"Thailand";
        System.out.println(newname);
        newname = newname.toUpperCase();
        System.out.println(newname);

    }
    
}
