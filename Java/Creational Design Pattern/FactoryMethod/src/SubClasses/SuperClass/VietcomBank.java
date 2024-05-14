package SubClasses.SuperClass;

import SuperClass.Bank;

public class VietcomBank implements Bank {
    @Override
    public String getBankName() {
        return "VietComBank";
    }
}