package view.adapter;

public class TranslatorAdapter implements VietnameseTarget {
    private JapaneseAdaptee adaptee;

    public TranslatorAdapter(JapaneseAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(String words) {
        System.out.println("Doc tu do di");
        System.out.println(words);
        String vn = this.translate(words);
        adaptee.receive(vn);
    }

    private String translate(String vn){
        System.out.println("Ta dang dich day");
        return "こんにちは";
    }
}
