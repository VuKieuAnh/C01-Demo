import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Material> materials = new ArrayList<>();
        materials.add(new Meat());
        materials.add(new CrispyFlour());
        for(Material m: materials){
            System.out.println(m.getAmount());
        }
    }
}
