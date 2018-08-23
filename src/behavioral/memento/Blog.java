package behavioral.memento;

public class Blog {
    private String title;
    private String text;
    private String author;

    public BlogMemento save() {
        return new BlogMemento(title, text);
    }

    public void revert(BlogMemento blogMemento) {
        this.title = blogMemento.getTitle();
        this.text = blogMemento.getText();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
