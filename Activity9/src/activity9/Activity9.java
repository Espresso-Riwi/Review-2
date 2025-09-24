
package activity9;

import java.util.ArrayList;

public class Activity9 {


            public static void main(String[] args) {
        ArrayList<Formater> list = new ArrayList<>();
        list.add(new UpperCase());
        list.add(new LowerCase());
        list.add(new TitleCase());

        String text = "hello java world";
        for (Formater f : list) {
            System.out.println(f.format(text));
        }
    }

    }
    
