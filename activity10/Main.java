package activity10;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Runnable> routes = new HashMap<>();
        routes.put("/home", () -> System.out.println("Welcome Home"));
        routes.put("/about", () -> System.out.println("About Us Page"));
        routes.put("/contact", () -> System.out.println("Contact Us"));

        String[] requests = {"/home", "/contact", "/other"};

        for (String r : requests) {
            Runnable action = routes.get(r);
            if (action != null) {
                action.run();
            } else {
                System.out.println("404");
            }
        }
    }
}