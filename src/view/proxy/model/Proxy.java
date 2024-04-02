package view.proxy.model;

public class Proxy implements IDoSomething {
    String name;
    Giamdoc giamdoc;

    public Proxy(String name) {
        this.name = name;
        this.giamdoc = new
                Giamdoc();
    }

    public Proxy(String name, Giamdoc giamdoc) {
        this.name = name;
        this.giamdoc = giamdoc;
    }

    @Override
    public void chuyenLuong() {
        if (name.equals("ketoan"))
        giamdoc.chuyenLuong();
        else
        throw new RuntimeException();
    }
}
 class Giamdoc implements IDoSomething {
    @Override
    public void chuyenLuong() {
        System.out.println("Luong day, keu it thoi");
    }
}
