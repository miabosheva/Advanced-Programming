package mk.finki.ukim.np.aud4.bank;

public abstract class Account {
    private String holderName;
    private int number;
    private double curr_amount;

    public Account(String holderName, int number, double curr_amount) {
        this.holderName = holderName;
        this.number = number;
        this.curr_amount = curr_amount;
    }

    public double getAmount(){
        return curr_amount;
    };

    public void addAmount(double amount){
        this.curr_amount += amount;
    }

    public double getCurr_amountt(){
        return this.curr_amount;
    }
}
