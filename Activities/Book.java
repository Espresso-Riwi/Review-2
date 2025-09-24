public class Book extends Document {
    int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    @Override
    int pages() {
        return pages;
    }
}
