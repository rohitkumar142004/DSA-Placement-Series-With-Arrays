package String;

public class RemovindDuplicatesFromString {
    static void main(String[] args) {
        String str = "Rohitr Kumar";
        String res = "";
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(!res.contains(String.valueOf(ch))){
                res += ch;
            }
        }
        System.out.println(res);
    }
}
