package learninglambda.calculator;

/**
 *
 * @author sscerbatiuc
 */
public class CalculatorNewDemo {

    public static void main(String[] args) {
        double a = 14.5;
        double b = 33.5;
        MathOperation sum = (x, y) -> x + y;
        MathOperation substraction = (x, y) -> x - y;
        MathOperation multiplication = (x, y) -> x * y;
        MathOperation division = (x, y) -> x / y;

        System.out.println("Addition" + sum.execute(a, b));
        System.out.println("Substraction" + substraction.execute(a, b));
        System.out.println("Multiplication" + multiplication.execute(a, b));
        System.out.println("Division" + division.execute(a, b));
    }
}

@FunctionalInterface
interface MathOperation {
    public double execute(double x, double y);
}
