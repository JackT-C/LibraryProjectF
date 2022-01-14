package Library;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static File myObj = new File("Books.txt");
    public static ArrayList<String> booklibrary = new ArrayList<>();
    public static String Scan(String question) {
        System.out.println(question);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
    public static void main(String[] args) {
        System.out.println("welcome to the library please log in: ");
        Library.Login.Login();
        String userSelection = Scan("please select a service out of the following: (Add Book, Look up, Borrow, Remove Book, Buy, Add User, Remove User)");
        if (userSelection.equalsIgnoreCase("add book")){
            LookupAddBook.getbookdetails();
        }
        if (userSelection.equalsIgnoreCase("look up")){
            LookupAddBook.Booklookup();
        }
        if (userSelection.equalsIgnoreCase("borrow")){

        }
        if (userSelection.equalsIgnoreCase())
        Library.WriteCreateFile.CreateFIle();
        Library.WriteCreateFile.WriteToFile();
    }
}