import java.util.ArrayList;
import java.util.Scanner;

class Book
{
    private String title,author;
    private int ISBN;

    Book(String title ,String author,int ISBN)
    {
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + "]";
    }


    public static ArrayList <Book> bookscoll=new ArrayList<Book>();

    public static void addbook(Book books)
    {
        bookscoll.add(books);
    }
    public static void removeBook(Book books)
    {
        bookscoll.remove(books);
    }

    public static ArrayList<Book> getCollection()
    {
        return bookscoll;
    }
}

public class Fourth
{
    
    public static void main(String[] args) 
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name=sc.nextLine();
        System.out.println("EntER author: ");
        String author=sc.nextLine();
        System.out.println("Enter isbn: ");
        int ISBN=sc.nextInt();
        Book b1=new Book(name, author, ISBN);
        Book.addbook(b1);

        ArrayList<Book>bookscoll=Book.getCollection();
        for(Book bo:bookscoll)
        {
            System.out.println(bo);
        }
        sc.close();
    }
}