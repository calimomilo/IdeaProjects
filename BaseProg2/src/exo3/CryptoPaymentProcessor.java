package exo3;

import java.math.BigDecimal;

public class CryptoPaymentProcessor extends PaymentProcessor{
    public CryptoPaymentProcessor(String name) {
        super(name);
    }

    @Override
    public boolean isValid(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.valueOf(10)) > -1){
            return true;
        }
        return false;
    }

    @Override
    public void process(BigDecimal amount) {
        System.out.println("Cryptoprocessing " + amount);
    }
}
