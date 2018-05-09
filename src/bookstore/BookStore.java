package bookstore;
import java.util.Arrays;

public class BookStore {

    static Author Neruda=new Author("Pablo Neruda",25);
    static Author Marquez=new Author("Gabriel Garcia Marquez",17);
    static Author Cohello=new Author("Paolo Cohello",8);

    static Book novela=new Book("One hundred years of solitude",8.50,Marquez);
    static Book novela2=new Book("Chronicles of announced dead",4.75,Marquez);
    static Book poetry=new Book("A desperate song",7.50,Neruda);
    static Book novela3=new Book("The alchemist", 12.50,Cohello);
    static Book novela4=new Book("Brida",8.45,Cohello);


    static Customer [] usuarios={new Customer("Juan"),new Customer("Jose"),new Customer("luis"),new Customer("Maria")
            ,new Customer("Loreen"),new Customer("Petra"),new Customer("Piggy"),new Customer("Juan")};


    public static void main(String[] args) {
        Shop micompra=new Shop(usuarios[0]);
        micompra.addBook(novela);
        System.out.println(micompra.toString());
        micompra.addBook(poetry);
        System.out.println(micompra.toString());

    }


}
