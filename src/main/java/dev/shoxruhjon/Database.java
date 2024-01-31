package dev.shoxruhjon;

import java.io.File;
import java.util.ArrayList;

public class Database {

    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<String> usernames = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<String> bookNames = new ArrayList<>();
    private File usersFile = new File(Main.class.getClassLoader().getResource("Users").getFile());
    private File booksFile = new File(Main.class.getClassLoader().getResource("Books").getFile());

    public Database() {
        if (!usersFile.exists())
            usersFile.mkdirs();
        if (!booksFile.exists())
            booksFile.mkdirs();
    }

    public void addUser(User user){
        users.add(user);
        usernames.add(user.getName());
    }

    public int login(String phoneNumber, String email){
        int n = -1;
        for (User user : users) {
            if (user.getPhonenumber().matches(phoneNumber) && user.getEmail().matches(email)){
                n = users.indexOf(user);
                break;
            }
        }
        return n;
    }

    public User getUser(int n){
        return users.get(n);
    }

    public void AddBook(Book book){
        books.add(book);
        bookNames.add(book.getName());
    }
}
