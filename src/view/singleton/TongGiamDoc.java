package view.singleton;

public class TongGiamDoc {
    private static TongGiamDoc instance;
    private String name;
//    chi dc tao 1 doi tuong

    private TongGiamDoc(String name) {
        this.name = name;
    }
    public static TongGiamDoc getInstance(String name){
//        neu instance == null thi moi goi constructor
        if (instance==null){
            synchronized ((TongGiamDoc.class)){
                if (instance ==null)
                    instance = new TongGiamDoc(name);
            }

        }
//        tra ve instance
        return instance;
    }

    @Override
    public String toString() {
        return "TongGiamDoc{" +
                "name='" + name + '\'' +
                '}';
    }


}
