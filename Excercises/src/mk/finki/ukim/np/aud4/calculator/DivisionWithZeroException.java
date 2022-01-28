package mk.finki.ukim.np.aud4.calculator;

public class DivisionWithZeroException extends Exception {
    public DivisionWithZeroException() {
        super(String.format("Cannot divide with zero!"));
    }

    public String getMessage(){
        return String.format("Cannot divide with zero!");
    }
}
