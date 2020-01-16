package learninglambda.calculator;

/**
 *
 * @author sscerbatiuc
 */
public class CalculatorNewDemo {

    public static void main(String[] args) {
        double a = 14.5;
        double b = 33.5;
        MathOperation addition = (x, y) -> x + y;
        MathOperation substraction = (x, y) -> x - y;
        MathOperation multiplication = (x, y) -> x * y;
        MathOperation division = (x, y) -> x / y;

        System.out.println("Addition" + addition.calculate(a, b));
        System.out.println("Substraction" + substraction.calculate(a, b));
        System.out.println("Multiplication" + multiplication.calculate(a, b));
        System.out.println("Division" + division.calculate(a, b));
    }
}

@FunctionalInterface
interface MathOperation {
    public double calculate(double x, double y);
}
