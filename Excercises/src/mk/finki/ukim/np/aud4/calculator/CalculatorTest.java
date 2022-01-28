package mk.finki.ukim.np.aud4.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(in);

        while(true){
            Calculator calc = new Calculator();
            System.out.println(calc);

            while(true){
                String line = bufferedReader.readLine();
                String[] lines = line.split("\\s+");
                char check = getCharLower(line);

                //User clicks result
                if(check == 'r'){
                    System.out.println(calc);
                    break;
                }
                else if(check == '?'){
                    break;
                }

                char operator = lines[0].charAt(0);
                double value = Double.parseDouble(lines[1]);
                try{
                    System.out.println(calc.operation(value, operator));
                } catch (UnknownOperatorException | DivisionWithZeroException e) {
                    System.out.println(e.getMessage());;
                }
            }
            System.out.println("Retry? (Y/N)");
            String line = bufferedReader.readLine();
            char choice = Character.toLowerCase(line.charAt(0));
            if(choice == 'n'){
                break;
            }
        }
    }

    private static char getCharLower(String line) {

        if(line.trim().length()>0){
            return Character.toLowerCase(line.charAt(0));
        }
        return '?';
    }
}
