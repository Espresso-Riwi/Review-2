package Activity12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> dict = new HashMap<>();

        dict.put("hola", new ArrayList<>(Arrays.asList("hello","hi")));
        dict.put("adios", new ArrayList<>(Arrays.asList("bye","goodbye")));
        dict.put("gracias", new ArrayList<>(Arrays.asList("thanks","thank you")));

        // add new translation
        dict.get("hola").add("hey");

        for (String word : dict.keySet()) {
            System.out.println(word+": "+String.join(", ", dict.get(word)));
        }
    }
}
