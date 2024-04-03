package storage;

import model.User;

import java.util.List;

public interface IGenericStorage<T> {
    void writeFile(List<T> user);
    List<T> readFile();
}
