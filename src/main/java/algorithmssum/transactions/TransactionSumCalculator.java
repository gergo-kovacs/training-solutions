package algorithmssum.transactions;

import java.util.List;

public class TransactionSumCalculator {
    public int sumAmountOfCreditEntries(List<Transaction> transactions){
        int sum = 0;
        for (Transaction t:transactions) {
            if(t.isCredit()==true && t.isDebit()==true)
            sum+=t.getAmount();
        }
        return sum;
    }
}
