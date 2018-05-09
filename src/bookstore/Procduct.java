package bookstore;

public class Procduct {

    private  String title;
    private  double price;

    public Procduct(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public  String getTitle() {
        return title;
    }

    public  void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public  void setPrice(double price) {
        this.price = price;
    }


}
