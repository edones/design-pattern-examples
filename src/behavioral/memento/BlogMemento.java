package behavioral.memento;

public class BlogMemento {
    private String title;
    private String text;

    //author state not saved, may represent transient data

    public BlogMemento(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
