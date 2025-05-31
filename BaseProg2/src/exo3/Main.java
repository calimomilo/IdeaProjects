package exo3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PaymentProcessor pp = new CryptoPaymentProcessor("crypto");
        List<PaymentProcessor> ppList = new ArrayList<>();
        ppList.add(pp);
        List<BigDecimal> amounts = new ArrayList<>();
        amounts.add(BigDecimal.valueOf(100));
        BatchPaymentService bs = new BatchPaymentService();
        bs.processAll(ppList, amounts);

    }
}