package it.unisa.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator miaCalcolatrice = new Calculator();

        System.out.println("--- Calcolatrice Java ---");

        System.out.print("Inserisci il numero (o il primo numero): ");
        float n1 = input.nextFloat();

        System.out.print("Inserisci l'operazione (+, -, *, /, ^, sin, cos, tan): ");
        String operazione = input.next().toLowerCase(); // Convertito in minuscolo per sicurezza

        float n2 = 0;
        // Chiediamo il secondo numero solo se NON è una funzione trigonometrica
        if (!operazione.equals("sin") && !operazione.equals("cos") && !operazione.equals("tan")) {
            System.out.print("Inserisci il secondo numero: ");
            n2 = input.nextFloat();
        }

        // Gestione delle operazioni
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
            case "sin":
                // Assumendo che la classe Calculator abbia questi metodi
                miaCalcolatrice.sin(n1);
                break;
            case "cos":
                miaCalcolatrice.cos(n1);
                break;
            case "tan":
                miaCalcolatrice.tan(n1);
                break;
            default:
                System.out.println("Operazione non riconosciuta!");
                input.close();
                return; // Esce dal programma se l'operazione è errata
        }

        System.out.println("Risultato: " + miaCalcolatrice.getLastResult());

        input.close();
    }
}