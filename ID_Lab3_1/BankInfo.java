package ID_Lab3_1;

/**
 * BankInfo
 */
public class BankInfo {
    private String name;
    private String idNumber;
    public String AccountName(String n){
        name = n;
        return name;
    }
    public String AccountID(String id){
        idNumber = id;
        return idNumber;
    }
    public String toString(){
        return "id="+idNumber+" Account Name="+name;
    }
    
}