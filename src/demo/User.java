package demo;
//dinh nghia 1 kieu du lieu moi
public class User {
    static String lop ="CodeGymHN";
    private String name;
    private int age;

    private int w;

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, int age, int w) {
        this.name = name;
        this.age = age;
        this.w = w;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", w=" + w +
                '}';
    }
}
