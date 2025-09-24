package activity9;
import java.util.ArrayList;

public class TitleCase implements Formater {

    @Override
    public String format(String s) {
        String[] parts = s.split(" ");
        ArrayList<String> words = new ArrayList<>();

        for (String p : parts) {
            if (p.length() > 0) {
                String word = Character.toUpperCase(p.charAt(0)) 
                              + p.substring(1).toLowerCase();
                words.add(word);
            }
        }

        return String.join(" ", words);
    }
}
