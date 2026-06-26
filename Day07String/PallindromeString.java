package String;
public class PallindromeString {
    static void main(String[] args) {
        String str = "madam";
        String rev = "";
        for(int i = str.length()-1; i>=0;i--){
            char ch = str.charAt(i);
            rev += ch;
        }
        if(str.equals(rev)){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
    }
}
