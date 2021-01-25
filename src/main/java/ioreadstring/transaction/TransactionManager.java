package ioreadstring.transaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {

    private List<BankAccount> accountList = new ArrayList<>();

    public List<BankAccount> getAccountList() {
        return accountList;
    }

    public void uploadListFromFile(String file){
        Path path = Path.of(file);
        try {
            List<String> accountText = Files.readAllLines(path);
            for (String item:accountText) {
                String[] person = item.split(";");
                accountList.add(new BankAccount(person[0],person[1],Integer.parseInt(person[2])));
            }
        } catch (IOException e) {
            throw new IllegalStateException();
        }
    }

    public void makeTransactions(String file){
        Path path = Path.of(file);
        try {
            List<String> transactions = Files.readAllLines(path);
            for (String item:transactions) {
                String[] actions = item.split(";");
                for (BankAccount bankAccount : accountList) {
                    if (actions[0].equals(bankAccount.getAccountNumber())) {
                        bankAccount.setBalance(Integer.parseInt(actions[1]));
                    }
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException();
        }
    }


}
