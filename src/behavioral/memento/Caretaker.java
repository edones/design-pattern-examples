package behavioral.memento;

import java.util.Stack;

public class Caretaker {
    private Stack<BlogMemento> blogHistory = new Stack<>();

    public void save(Blog blog) {
        blogHistory.push(blog.save());
    }

    public  void revert(Blog blog) {
        blog.revert(blogHistory.pop());
    }

}
