package view;

public class Main1 {
    public static void main(String[] args) {
//        2 dt
        TongGiamDoc a = TongGiamDoc.getInstance("Vuong");
        System.out.println(a);
        TongGiamDoc b = TongGiamDoc.getInstance("Minh");
        System.out.println(b);
    }
}
