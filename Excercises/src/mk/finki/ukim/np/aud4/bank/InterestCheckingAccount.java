package mk.finki.ukim.np.aud4.bank;

public class InterestCheckingAccount extends Account implements InterestBearingAccount{
    public static final double INTEREST_RATE = .03; //3%

    public InterestCheckingAccount(String holderName, int number, double curr_amount) {
        super(holderName, number, curr_amount);
    }

    @Override
    public void addInterest() {
        addAmount(getCurr_amountt()*INTEREST_RATE);
    }
}
