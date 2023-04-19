package interview;

public class Palindrome {

    public static void main(String[] args) {

        String str = "Radar", revereseStr = "";
        int strLength = str.length();

        for(int i = strLength-1 ; i >=0; i--){
            revereseStr = revereseStr + str.charAt(i);
        }
        if(str.toLowerCase().equals(revereseStr.toLowerCase())){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
