package dev.shoxruhjon;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Database database;
    public static void main(String[] args) {
        database = new Database();
        System.out.println("Welocome to E-Library!");
        int num;
        do {
            System.out.println("""
                    0. Exit
                    1. Login
                    2. New User""");
            num = scanner.nextInt();

            switch (num){
                case 1: login(); break;
                case 2: newUser(); break;
            }
        } while (num != 0);
    }

    private static void login() {
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.next();
        System.out.println("Enter email: ");
        String email = scanner.next();
        int n = database.login(phoneNumber, email);
        if (n != -1){
            User user = database.getUser(n);
            user.menu(database, user);
        } else {
            System.out.println("User doesn't exist!");
        }
    }

    private static void newUser(){
        System.out.println("Enter name: ");
        String name = scanner.next();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.next();
        System.out.println("Enter email: ");
        String email = scanner.next();
        System.out.println("1. Admin\n2. Normal User");
        int n2 = scanner.nextInt();
        User user;
        if(n2 == 1) {
            user = new Admin(name, email, phoneNumber);
        } else {
            user = new NormalUser(name, email, phoneNumber);
        }
        database.addUser(user);
        user.menu(database, user);
    }
}