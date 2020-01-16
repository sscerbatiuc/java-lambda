package learninglambda.calculator;

/**
 *
 * @author sscerbatiuc
 */
public class CalculatorLambdaDemo {

    public static void main(String[] args) {
        double x = 14.5;
        double y = 65.6;

        Operation addOperation = (q, z) -> q + z;
        Operation substractOp = (double q, double z) -> q - z;
        Operation multiplyOp = (double q, double z) -> q * z;
        Operation divideOp = (double q, double z) -> q / z;

        calc(x, y, addOperation);
        calc(x, y, substractOp);
        calc(x, y, multiplyOp);
        calc(x, y, divideOp);
    }

    public static void calc(double a, double b, Operation op) {
        System.out.println(op.calculate(a, b));
    }
    
}

interface Operation {

    public double calculate(double a, double b);
}
