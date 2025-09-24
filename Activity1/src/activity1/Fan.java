
package activity1;


public class Fan implements IOperable{

    @Override
    public void start() {
        System.out.println("Start Fan");
    }

    @Override
    public void stop() {
        System.out.println("Stop Fan");
    }
    
}
