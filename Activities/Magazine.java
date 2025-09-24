public class Magazine extends Document {
    int pages;

    public Magazine(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    @Override
    int pages() {
        return pages;
    }
}
