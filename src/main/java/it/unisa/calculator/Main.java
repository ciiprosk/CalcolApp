package it.unisa.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator miaCalcolatrice = new Calculator();

        System.out.println("--- Calcolatrice Java ---");

        System.out.print("Inserisci il primo numero: ");
        float n1 = input.nextFloat();

        System.out.print("Inserisci l'operazione (+, -, *, /, ^, sin, cos, tan): ");
        String operazione = input.next();

        // Controlliamo se l'operazione è trigonometrica (unaria)
        if (operazione.equals("sin") || operazione.equals("cos") || operazione.equals("tan")) {

            // Esecuzione operazioni unarie
            switch (operazione) {
                case "sin":
                    miaCalcolatrice.sin(n1);
                    break;
                case "cos":
                    miaCalcolatrice.cos(n1);
                    break;
                case "tan":
                    miaCalcolatrice.tan(n1);
                    break;
            }

        } else {
            // Se non è trigonometrica, chiediamo il secondo numero
            System.out.print("Inserisci il secondo numero: ");
            float n2 = input.nextFloat();

            // Esecuzione operazioni binarie
            switch (operazione) {
                case "+":
                    miaCalcolatrice.sum(n1, n2);
                    break;
                case "-":
                    miaCalcolatrice.subtract(n1, n2);
                    break;
                case "*":
                    miaCalcolatrice.multiply(n1, n2);
                    break;
                case "/":
                    miaCalcolatrice.divide(n1, n2);
                    break;
                case "^":
                    miaCalcolatrice.power(n1, n2);
                    break;
                default:
                    System.out.println("Operazione non riconosciuta!");
                    input.close();
                    return;
            }
        }

        // Stampa il risultato finale una sola volta
        System.out.println("Risultato: " + miaCalcolatrice.getLastResult());

        input.close();
    }
}