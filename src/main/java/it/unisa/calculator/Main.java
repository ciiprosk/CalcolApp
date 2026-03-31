package it.unisa.calculator;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculcator miaCalcolatrice = new Calculcator();

        System.out.println("--- Calcolatrice Java ---");

        System.out.print("Inserisci il primo numero: ");
        float n1 = input.nextFloat();

        System.out.print("Inserisci l'operazione (+, -, *, /, ^): ");
        String operazione = input.next();

        System.out.print("Inserisci il secondo numero: ");
        float n2 = input.nextFloat();

        boolean operazioneValida = true;

        // Gestione delle operazioni tramite simbolo
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
                operazioneValida = false;
        }

        input.close();
    }
}