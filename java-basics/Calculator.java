
public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b == 0) {
            // throw new Exception("Cannot divide by zero");
            return 0.0;
        }
        return a / b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }

    public static void testFunction(double actual, double expected) {
        boolean passed = actual == expected;

        if (passed) {
            System.out.println("Test passed");
        } else {
            System.out.println("Failed: Expected " + expected + " and got " + actual);
        }
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Calculator.testFunction(calculator.add(1,2), 3.0);
        Calculator.testFunction(calculator.subtract(10,2), 8.0);
        Calculator.testFunction(calculator.multiply(5,2), 10.0);
        Calculator.testFunction(calculator.divide(5,2), 2.5);
        
    }
}