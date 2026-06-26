package String;

public class CountVowelsAndConsonants {
    static void main(String[] args) {
        String str = "RohitKumar";
        str = str.toLowerCase();
        int vowels= 0;
        int consonants=0;
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='o'|| ch=='u'|| ch=='i'){
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
    }
}
