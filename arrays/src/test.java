import java.util.ArrayList;

public class test {
    public static void main(String[] args) {

    }

    public boolean checkIfPangram(String sentence) {
        ArrayList<Character> list = new ArrayList<>(sentence.length());
        for(int i=0; i<sentence.length();i++){
            list.add(sentence.charAt(i));
        }

        for(char i='a'; i<='z'; i++){
            if(!list.contains(i)){
                return false;
            }
        }

        return true;

    }
}
