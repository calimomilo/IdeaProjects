package exo3;

import java.math.BigDecimal;
import java.util.List;

public class BatchPaymentService {

    public void processAll(List<PaymentProcessor> processors, List<BigDecimal> amounts){
        for(int i = 0; i<processors.size(); i++){
            PaymentProcessor p = processors.get(i);
            BigDecimal d = amounts.get(i);
            p.execute(d);
        }
    }
}
