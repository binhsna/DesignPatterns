package FactoryClass;

import SubClasses.SuperClass.TPBank;
import SubClasses.SuperClass.VietcomBank;
import SuperClass.Bank;

public class BankFactory {
    private BankFactory() {
    }

    public static final Bank getBank(BankType bankType) {
        switch (bankType) {
            case TPBANK:
                return new TPBank();
            case VIETCOMBANK:
                return new VietcomBank();
            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
}
