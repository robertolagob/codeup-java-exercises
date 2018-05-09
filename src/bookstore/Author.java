package bookstore;

public class Author extends Person{


    private int nuberOfBooks;

    public Author(String name,int numberOfBooks) {
        super(name);
        this.nuberOfBooks=numberOfBooks;
    }
}
