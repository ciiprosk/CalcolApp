package it.unisa.calculator;

public class Test {
    // sum, subtract, multiply, divide, power, sin, cos, tan

    public boolean testSum (float firstNumber, float secondNumber) {
        Calculcator calculator = new Calculcator();
        return calculator.sum(firstNumber, secondNumber) == firstNumber + secondNumber;
    }

    public boolean testSubtract (float firstNumber, float secondNumber) {
        Calculcator calculator = new Calculcator();
        return calculator.subtract(firstNumber, secondNumber) == firstNumber - secondNumber;
    }

    public boolean testMultiply (float firstNumber, float secondNumber) {
        Calculcator calculator = new Calculcator();
        return calculator.multiply(firstNumber, secondNumber) == firstNumber * secondNumber;
    }

    public boolean testDivide (float firstNumber, float secondNumber) {
        Calculcator calculator = new Calculcator();
        return calculator.divide(firstNumber, secondNumber) == firstNumber / secondNumber;
    }

    public boolean testPower (float firstNumber, float secondNumber) {
        Calculcator calculator = new Calculcator();
        return calculator.power(firstNumber, secondNumber) == (float) Math.pow(firstNumber, secondNumber);
    }

    public boolean testSin (float firstNumber) {
        Calculcator calculator = new Calculcator();
        return calculator.sin(firstNumber) == (float) Math.sin(firstNumber);
    }

    public boolean testCos (float firstNumber) {
        Calculcator calculator = new Calculcator();
        return calculator.cos(firstNumber) == (float) Math.cos(firstNumber);
    }

    public boolean testTan (float firstNumber) {
        Calculcator calculator = new Calculcator();
        return calculator.tan(firstNumber) == (float) Math.tan(firstNumber);
    }

    public boolean testAll (float firstNumber, float secondNumber) {
        return testSum(firstNumber, secondNumber) && testSubtract(firstNumber, secondNumber) && testMultiply(firstNumber, secondNumber) && testDivide(firstNumber, secondNumber) && testPower(firstNumber, secondNumber) && testSin(firstNumber) && testCos(firstNumber) && testTan(firstNumber);
    }
}