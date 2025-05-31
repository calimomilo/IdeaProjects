package exo3;

import java.math.BigDecimal;

public abstract class PaymentProcessor {
    private String name;

    public PaymentProcessor(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public abstract boolean isValid(BigDecimal amount);

    public abstract void process(BigDecimal amount);

    public void execute(BigDecimal amount){
        System.out.println("Processing with " + this.name);
        if(this.isValid(amount)){
            this.process(amount);
            System.out.println("Done with " + this.name);
        }
        else {
            System.out.println("Validation failed with " + this.name);
        }
    }

}
