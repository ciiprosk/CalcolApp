package it.unisa.calculator;

import java.util.ArrayDeque;
import java.util.Queue;

public class Calculator{
    private float firstNumber;
    private float secondNumber;
    private float lastResult;
    private Queue<Float> history;


    public Calculator() {
        history = new ArrayDeque<>(10);
    }
    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        history = new ArrayDeque<>(10);
    }

    public float getLastResult() {
        return lastResult;

    }

    public float getFirstNumber() {
        return firstNumber;
    }

    public float getSecondNumber() {
        return secondNumber;

    }

    public void setFirstNumber(float firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(float secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setLastResult(float lastResult) {

        this.lastResult = lastResult;
        history.add(lastResult);
    }

    public float sum (float firstNumber, float secondNumber) {
       setLastResult(firstNumber + secondNumber);

        return lastResult;
    }

    public float subtract (float firstNumber, float secondNumber) {
        setLastResult(firstNumber - secondNumber);
        return lastResult;
    }

    public float multiply (float firstNumber, float secondNumber) {
        setLastResult(firstNumber * secondNumber);
        return lastResult;
    }

    public float divide (float firstNumber, float secondNumber) {
        setLastResult(firstNumber / secondNumber);
        return lastResult;
    }

    public float power (float firstNumber, float secondNumber) {
        setLastResult((float) Math.pow(firstNumber, secondNumber));
        return lastResult;
    }

    public float sin (float firstNumber) {
        setLastResult((float) Math.sin(firstNumber));
        return lastResult;
    }

    public float cos (float firstNumber) {
        setLastResult((float) Math.cos(firstNumber));
        return lastResult;
    }

    public float tan (float firstNumber) {
        setLastResult((float) Math.tan(firstNumber));
        return lastResult;
    }

}
