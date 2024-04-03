package controller;

import model.User;
import storage.user.IReadWriteFile;
import storage.user.ReadWriteFile;

import java.util.List;

public class UserManager {
    private static IReadWriteFile readWriteFile = ReadWriteFile.getInstance();
    private static List<User> userList = readWriteFile.readFile();

    public static void addNewUser(User user){
        userList.add(user);
        readWriteFile.writeFile(userList);
    }
}
