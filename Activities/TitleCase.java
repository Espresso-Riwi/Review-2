import java.util.ArrayList;

public class TitleCase implements Formatter{
    @Override
    public String format(String s) {
        ArrayList<Character> letters = new ArrayList<Character>();

        for (int i = 0; i < s.length(); i++) {
            letters.add(s.charAt(i));
        }

        String formattedWord = "";

        for (int i = 0; i < letters.size(); i++) {
            if (i == 0){
                formattedWord += letters.get(i).toString().toUpperCase();
            }else{
                formattedWord += letters.get(i).toString().toLowerCase();
            }
        }

        return formattedWord;
    }
}
