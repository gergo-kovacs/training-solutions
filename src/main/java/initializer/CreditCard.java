package initializer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    public static final List<Rate> ACTUAL_RATES=new ArrayList<>();

    private long balance;
    private Currency currency;

    static{
        ACTUAL_RATES.add(new Rate(Currency.HUF, 1.0));
        ACTUAL_RATES.add(new Rate(Currency.EUR, 308.23));
        ACTUAL_RATES.add(new Rate(Currency.SFR, 289.24));
        ACTUAL_RATES.add(new Rate(Currency.GBP, 362.23));
        ACTUAL_RATES.add(new Rate(Currency.USD, 289.77));
    }

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public CreditCard(long balance, Currency currency,List<Rate> ACTUAL_RATES) {
        this.balance = balance;
        this.currency = currency;

    }

    public boolean payment(long sum, Currency c){
        long value = Math.round(sum * getConversionRate(currency));
        if (value <= balance) {
            balance -= value;
            return true;
        }
        return false;
    }

    public boolean payment(long money){
        return payment(money,Currency.HUF);
    }

    public long getBalance() {
        return balance;
    }

    private double getConversionRate(Currency currency) {
        for (Rate rate : ACTUAL_RATES) {
            if (rate.getCurrency() == currency) {
                return rate.getConversionFactor();
            }
        }
        return 1.0;
    }
}
