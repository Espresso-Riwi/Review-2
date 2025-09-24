
package activitie4;


public abstract class Process {
    final void execute(){
     prepare();
     process();
     finish();
     
    }
    public abstract void prepare();
    public abstract void process();

    public void finish() {
        System.out.println("Ok");
    }
}
