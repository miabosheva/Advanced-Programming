package mk.finki.ukim.np.aud4.bank;

public class PlatinumCheckingAccount extends InterestCheckingAccount {

    public PlatinumCheckingAccount(String holderName, int number, double curr_amount) {
        super(holderName, number, curr_amount);
    }

    @Override
    public void addInterest() {
        addAmount(getCurr_amountt() * InterestCheckingAccount.INTEREST_RATE * 2);
    }
}
