
package activity1;
import java.util.ArrayList;
public class Activity1 {

    
    public static void main(String[] args) {
        ArrayList<IOperable> o = new ArrayList<>();
        Engine e = new Engine();
        Fan f = new Fan();
        
        o.add(e);
        o.add(f);
        
        for(int i = 0; i <o.size(); i++){
            o.get(i).start();
            o.get(i).stop();
        
        }
        

    }
    
}
