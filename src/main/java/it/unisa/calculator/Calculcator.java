
package it.unisa.calculator;

public class Calculcator {
    private float firstNumber;
    private float secondNumber;
    private float lastResult;


    public Calculcator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public float sum (float firstNumber, float secondNumber) {
        lastResult = firstNumber + secondNumber;
        return lastResult;
    }

    public float subtract (float firstNumber, float secondNumber) {
        lastResult = firstNumber - secondNumber;
        return lastResult;
    }

    public float multiply (float firstNumber, float secondNumber) {
        lastResult= firstNumber * secondNumber;
        return lastResult;
    }

    public float divide (float firstNumber, float secondNumber) {
        lastResult= firstNumber / secondNumber;
        return lastResult;
    }

    public float power (float firstNumber, float secondNumber) {
        lastResult= (float) Math.pow(firstNumber, secondNumber);
        return lastResult;
    }

    public float sin (float firstNumber) {
        lastResult= (float) Math.sin(firstNumber);
        return lastResult;
    }

    public float cos (float firstNumber) {
        lastResult= (float) Math.cos(firstNumber);
        return lastResult;
    }

    public float tan (float firstNumber) {
        lastResult= (float) Math.tan(firstNumber);
        return lastResult;
    }

}
