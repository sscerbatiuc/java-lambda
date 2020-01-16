package learninglambda.calculator;

/**
 *
 * @author sscerbatiuc
 */
public class CalculatorOldDemo {

    public static void main(String[] args) {
        double x = 15.4;
        double y = 17.4;
        CalculatorOld calcOld = new CalculatorOld();
        System.out.println("Addition" + calcOld.add(x, y));
        System.out.println("Substraction" + calcOld.substract(x, y));
        System.out.println("Multiplication" + calcOld.multiply(x, y));
        System.out.println("Division" + calcOld.divide(x, y));
    }

}

class CalculatorOld {

    public double add(double a, double b) {
        return a + b;
    }
    public double substract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        return a / b;
    }
    
}
