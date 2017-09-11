package pl.sda.tests.calculator;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public Double divide(Double a, Double b) {
        if (a == 0 || b == 0) {
            throw new ArithmeticException("Incorrect value");
        }

        return a / b;
    }

    public boolean isEven(int x) {
        return x % 2 == 0;
    }

    public Double toSquare(int x){
        return Math.sqrt(x);
    }

    public Double raiseXToY (int x, int y){
        return Math.pow(x,y);
    }

    public Double calculateVAT(double x){
        return x+0.19*x;
    }

    public Double calculateGross(double x, double y){
        return x+ y*x/100;
    }

}