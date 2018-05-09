package bookstore;
import java.util.Arrays;
public class Shop {

    private Customer customer;
    private  Book[] books;
    private double totalPrice;


    public Shop(Customer customer) {
        this.customer = customer;
        this.books = new Book[0];
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

//    public void setTotalPrice(double totalPrice) {
//        this.totalPrice = shopCost();
//    }


//    public double shopCost(){
//        double myTotal=0;
//        for (int i=0;i<this.books.length;i++){
//            myTotal+=this.books[i].getPrice();
//        }
//        return myTotal;
//    }

    public String toString(){
        return "summary:\n"
                +"customer: "+customer.getName()+"\n"
                +"number of books you bought:"+books.length+"\n"
                +"Total Price: "+totalPrice;
    }


    public  void addBook(Book thisBook){
        this.books=Arrays.copyOf(this.books,this.books.length+1);
        this.books[this.books.length-1]=thisBook;
        this.totalPrice+=thisBook.getPrice();

        }


}
