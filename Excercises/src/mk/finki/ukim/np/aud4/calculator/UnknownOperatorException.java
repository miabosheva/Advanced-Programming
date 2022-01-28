package mk.finki.ukim.np.aud4.calculator;

public class UnknownOperatorException extends Exception {
    private char operator;

    public UnknownOperatorException(char operator) {
        super(String.format("%c is not a supported operator", operator));
        this.operator = operator;
    }

    public String getMessage(){
        return String.format("%s is not a supported operator", operator);
    }
}
