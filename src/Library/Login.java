package Library;

import static Library.Main.Scan;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public static ArrayList<String> usernames = new ArrayList<>();
    public static ArrayList<String> passwords = new ArrayList<>();
    public static ArrayList<String> admins = new ArrayList<>();

    public static void Login() {

        usernames.add("Kvetch");
        passwords.add("password");
        admins.add("Kvetch");
        Boolean login = Boolean.TRUE;
        while (login == Boolean.TRUE) {
            String userInputname = Scan("username: ");
            String userInputpw = Scan("password: ");
            if (usernames.toString().contains(userInputname)) {
                if (passwords.toString().contains(userInputpw)) {
                    System.out.println("login successful ");
                    login = Boolean.FALSE;
                    if (admins.toString().contains(userInputname)){
                        System.out.println("admin recognised ");
                    }
                } else {
                    System.out.println("password not recognised ");
                    login = Boolean.TRUE;
                }
            } else {
                System.out.println("username not recognised ");
                login = Boolean.TRUE;
            }
        }
    }
    public static void AddRemoveUser(){
        Scanner s = new Scanner(System.in);
        System.out.println("how many users do you want to add?");
        int numofusers = s.nextInt();
        for (int i = 0; i <numofusers ; i++) {
            String name = Scan("username: ");
            usernames.add(name);
            String pw = Scan("password: ");
            passwords.add(pw);
            String levelofaccess = Scan("are they admin?");
            if(levelofaccess.contains("Yes")){
                admins.add(name);
            }
        }
    }

}