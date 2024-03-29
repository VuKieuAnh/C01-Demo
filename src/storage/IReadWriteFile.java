package storage;

import model.User;

import java.util.List;

public interface IReadWriteFile {
//    ten cua phuongthuc
//    tham so
//    Kieu du lieu tra ve
    void writeFile(List<User> user);
    List<User> readFile();
}
