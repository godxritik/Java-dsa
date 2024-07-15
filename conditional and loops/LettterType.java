import java.util.Scanner;

public class LettterType {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter the string : ");
        String sentence = inp.nextLine();
        int vowel =0;
        int consonant =0;
        int len = sentence.length();

        for(int i= 0 ; i<len;i++){
            if(sentence.charAt(i)=='a' || sentence.charAt(i)=='e' || sentence.charAt(i)=='i' || sentence.charAt(i)=='o' || sentence.charAt(i)=='u' ){
                vowel++;
            }
            else {
                consonant++;
            }

        }

        System.out.println("number of vowels : " + vowel);
        System.out.println("number of consonant : " + consonant);

    }
}
