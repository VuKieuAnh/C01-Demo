package view;

import controller.UserManager;
import model.User;
import storage.IReadWriteFile;
import storage.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
//    chay du an -> cho doc du lieu luon
    private static IReadWriteFile readWriteFile = ReadWriteFile.getInstance();
    private static List<User> list = readWriteFile.readFile();
    public static void main(String[] args) {
        System.out.println(list);

    }

    public static User createNewUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten");
        String name = scanner.nextLine();
        System.out.println("nhap tuoi");
        int age = scanner.nextInt();
        return new User(name, age);
    }
}
