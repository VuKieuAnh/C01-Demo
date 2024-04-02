package view.adapter;

public class VietnameseClient {
    public static void main(String[] args) {
        VietnameseTarget c = new TranslatorAdapter(new JapaneseAdaptee());
        c.send("Xin chao");
    }
}
