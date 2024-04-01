package view.factory;

public class BankFactory {

    double a = 3.14;
    private BankFactory() {
    }

    public static final Bank getBank(TypeBank bankType) {
        switch (bankType) {

            case TPBANK:
                return new TPBank();

            case VCB:
                return new VCB();

            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
}
