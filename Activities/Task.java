public class Task {

    private String id;
    private String title;
    private int priority;

    public Task(String id, String title, int priority) {
        setId(id);
        setTitle(title);
        setPriority(priority);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
