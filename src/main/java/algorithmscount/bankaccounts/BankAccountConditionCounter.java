package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan( List<BankAccount> bankAccountList,int balanceLimit) {
        int count=0;
        for (BankAccount bac : bankAccountList) {
            if(bac.getBalance()>balanceLimit){
                count++;
            }
        }
        return count;
    }
}
