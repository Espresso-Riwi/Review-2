public class Fan implements Operable{

    @Override
    public void start() {
        System.out.println("The fan is on");
    }

    @Override
    public void stop() {
        System.out.println("The fan is off");
    }

}
