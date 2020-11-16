package algorithmscount.bankaccounts;

import java.util.List;

public class TransactionCounter {

    public int countEntryLessThan(List<Transaction> transactionList, int limit){
        int count=0;
        for (Transaction tr : transactionList) {
            if(tr.getAmount()<limit){
                count++;
            }
        }
        return count;
    }
}
