public class Engine implements Operable{

    @Override
    public void start() {
        System.out.println("The engine is on");
    }

    @Override
    public void stop() {
        System.out.println("The engine is off");
    }
}
