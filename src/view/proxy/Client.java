package view.proxy;

import view.proxy.model.Giamdoc;
import view.proxy.model.IDoSomething;
import view.proxy.model.Proxy;

public class Client {
    public static void main(String[] args) {
//        IDoSomething doSomething = new Proxy("ketoan");
//        doSomething.chuyenLuong();
        IDoSomething doSomething1 = new Proxy("thuky");
        doSomething1.chuyenLuong();
    }
}
