
package activity2;
import java.util.ArrayList;

public class Activity2 {

  
    public static void main(String[] args) {
        
        ArrayList<ICalculable> a = new ArrayList();
        Addition ad = new Addition();
        Multiplication m = new Multiplication();
        a.add(ad);
        a.add(m);
        
        System.out.println(a.getFirst().calculate(3,4));
        System.out.println(a.getLast().calculate(3,4));
    }
    
}
