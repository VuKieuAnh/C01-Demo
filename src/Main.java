import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalDate x = LocalDate.now();
//        Cho phep coi kieu du lieu nhu 1 dang tham so
//        Cho phep instance cua List co the lam viec voi nhieu loai doi tuong
        ArrayList<Meat> materialList = new ArrayList<>();
        materialList.add(new Meat("01", "m1", x, 20, 2));
        materialList.add(new Meat("03", "m3", x, 100, 3));
        materialList.add(new Meat("02", "m2", x, 11, 5));



        System.out.println(materialList);
        //        Lop nac danh
//        Khoi tao doi tuong thuoc interface va trien khai phuong thuc abstract
//        Comparator<Meat> meatComparator = new Comparator<Meat>() {
//            @Override
//            public int compare(Meat o1, Meat o2) {
//                return o1.getCost()-o2.getCost();
//            }
//        };
        Comparator<Meat> comparator = new Comparator<Meat>() {
            @Override
            public int compare(Meat o1, Meat o2) {
                return (int) (o1.getWeight()-o2.getWeight());
            }
        };
//        cung cap tieu chi so sanh cho sort
//        1 tieu chi dang mac dinh cho Meat

        Collections.sort(materialList);
        System.out.println("Theo cost");
        System.out.println(materialList);
        Collections.sort(materialList, comparator);
        System.out.println("Theo w");
        System.out.println(materialList);

    }
}
