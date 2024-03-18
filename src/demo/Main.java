package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("KA", 31, 45));
        users.add(new User("Minh", 30, 50));
        users.add(new User("Minh", 20, 51));
        users.add(new User("Minh", 25, 40));
//        Anonymous class
        Comparator<User> userComparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.getAge() <o2.getAge()) return -1;
                if (o1.getAge() >o2.getAge()) return 1;
                return 0;
            }
        };
        Comparator<User> byW = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getW() - o2.getW();
            }
        };
//        danh sach can sap xep
//        tieu chi can sap xep
        Collections.sort(users, byW);
        System.out.println(users);
    }
}
