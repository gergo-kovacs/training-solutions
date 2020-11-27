package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {

     public boolean containsBalanceGreaterThan(List<BankAccount> accounts, int balanceLimit){
         for (BankAccount a:accounts) {
             if(a.getBalance()>=balanceLimit){
                 return true;
             }
         }
         return false;
     }
}