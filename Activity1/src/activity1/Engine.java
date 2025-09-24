
package activity1;

public class Engine implements IOperable{

    @Override
    public void start() {
        System.out.println("start Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Engine");
    }
    
}
