package learninglambda.calculator;

/**
 *
 * @author sscerbatiuc
 */
public class AreaCalcDemo {

    public static void main(String[] args) {
        // area of a square a=10
        SquareAreaOp sqArea = a -> a * a;
        sqArea.calcArea(10);
        sqArea.calcArea(15);
        sqArea.calcArea(20);
        // area of a rectangle z=15, y=12
        RectangleAreaOp rectangleArea = (a, b) -> a * b;
        rectangleArea.calcArea(15, 12);
    }
}

interface SquareAreaOp {

    public double calcArea(double a);
}

interface RectangleAreaOp {

    public double calcArea(double a, double b);
}
