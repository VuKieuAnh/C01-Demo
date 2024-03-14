import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Material material[] = new Material[10];
        material[0] = new CrispyFlour();
        material[1] = new Meat();
        LocalDate localDate = LocalDate.of(2024, 2, 13);
        material[1].setManufacturingDate(localDate);
        System.out.println(localDate);
        double sum =0;
        for (int i = 0; i < material.length; i++) {
//            tien khuyen nghi;
            if (material[i] instanceof Discount)
            sum += ((Discount)material[i]).getRealMoney();
        }
    }
}
