package Library;
import static Library.Main.booklibrary;
import static Library.Main.Scan;

public class LookupAddBook {
    public static void Booklookup() {
        String infogiven = Scan("please provide any details you have of the book eg book title, isbn, author, genre");
        if (booklibrary.toString().contains(infogiven)) {
            System.out.println("book is in the library");
        } else {
            System.out.println("sorry we don't have that book");
        }
    }
    public static String getbookdetails() {
        String bookname = Scan("name of book: ");
        String authorname = Scan("author: ");
        String genre = Scan("genre: ");
        Integer ISBN = Integer.valueOf(Scan("ISBN (4 Digits):"));
        return (bookname + ", " + authorname + ", " + genre + ", "+ISBN);


    }}