package SubClasses.SuperClass;

import SuperClass.Bank;

public class TPBank implements Bank {

    @Override
    public String getBankName() {
        return "TPBank";
    }
}