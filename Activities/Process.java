public abstract class Process {

    final void execute(){
        prepare();
        process();
        finish();
    }

    abstract void prepare();
    abstract void process();
    void finish(){
        System.out.println("Print");
    }
}
