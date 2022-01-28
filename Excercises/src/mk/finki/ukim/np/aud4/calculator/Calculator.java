package mk.finki.ukim.np.aud4.calculator;

public class Calculator {
    private double result;

    public Calculator(){
        this.result = 0;
    }

    public String operation(double value, char operator) throws UnknownOperatorException, DivisionWithZeroException {
        double temp = result;
        if(operator == '+'){
            result+=value;
        }else if(operator == '-'){
            result-=value;
        }else if(operator == '/'){
            if(value==0){
                throw new DivisionWithZeroException();
            }
            else {
                result/=value;
            }
        }else if(operator == '*'){
            result*=value;
        }else if(operator == '=') {
            return String.format("Result is: %.02f", result);
        }else{
            throw new UnknownOperatorException(operator);
        }
        return String.format("%.02f %c %.02f = %.02f", temp, operator, value, result);
    }

    @Override
    public String toString() {
        return String.format("Result: %f", result);
    }
}
