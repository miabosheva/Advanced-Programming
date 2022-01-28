package mk.finki.ukim.np.aud4.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accountList;

    public Bank(int maxCapacity) {
        List<Account> accountList = new ArrayList<Account>();
    }

    public void addAccount(Account account){
            this.accountList.add(account);
    }

    public double totalAssets() {
        double total = 0;
        for (Account account : accountList) {
            total += account.getAmount();
        }
        return total;
    }

    public void addInterest() {
        for (Account account : accountList) {
            if (account instanceof InterestBearingAccount) {
                //points to the same class, it's a reference , not a copy
                InterestBearingAccount iba = (InterestBearingAccount) account;
                iba.addInterest();
            }
        }
    }

}
