package algorithmssum.transactions;

import static algorithmssum.transactions.TransactionOperation.CREDIT;
import static algorithmssum.transactions.TransactionOperation.DEBIT;

public class Transaction {

    private String accountNumber;  // számlaszám
    private TransactionOperation transactionOperation;   // ( enum); //CREDIT vagy DEBIT
    private int amount;   // a tranzakció összege

    public Transaction(String accountNumber, TransactionOperation transactionOperation, int amount) {
        this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public TransactionOperation getTransactionOperation() {
        return transactionOperation;
    }

    public int getAmount() {
        return amount;
    }
    public boolean isCredit(){
        return this.transactionOperation == CREDIT;
    }
    public boolean isDebit(){
        return this.transactionOperation == DEBIT;
    }

}
