package bookstore;

public class Book extends Procduct{

    private   Author author;

    public Book(String title, double price, Author author) {
        super(title, price);
        this.author=author;
    }

    public   String toString(){
        return super.getTitle()+"\n"+author.getName();
    }
}
