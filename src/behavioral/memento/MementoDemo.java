package behavioral.memento;

public class MementoDemo {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Blog blog = new Blog();
        blog.setTitle("Farm Animal Blog");
        blog.setText("The quick brown fox jumps over the lazy dog.");
        blog.setAuthor("Farmer John");
        System.out.println(blog);
        caretaker.save(blog);

        blog.setText("Old McDonald had a farm, with a baaa baaa here...");
        blog.setAuthor("Old McDonny");
        System.out.println(blog);
        caretaker.save(blog);

        blog.setTitle("Old McDonald Song");
        System.out.println(blog);
        caretaker.save(blog);

        blog.setTitle("New McDonny Riddle");
        System.out.println(blog);
        //caretaker.save(blog);

        System.out.println("\nRevert");

        caretaker.revert(blog);
        System.out.println(blog);
        caretaker.revert(blog);
        System.out.println(blog);
        caretaker.revert(blog);
        System.out.println(blog);

        System.out.println("\nNote: Author state not saved, may represent transient data in actual scenario");
    }
}
