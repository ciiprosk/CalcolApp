package it.unisa.calculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator miaCalcolatrice = new Calculator();

        System.out.println("--- Calcolatrice Java ---");

        // Inizio del ciclo infinito
        while (true) {
            System.out.print("\nInserisci il numero (o scrivi 'esci' per chiudere): ");
            String primoInput = input.next();

            // Condizione di uscita dal programma
            if (primoInput.equalsIgnoreCase("esci")) {
                System.out.println("Chiusura della calcolatrice. Arrivederci!");
                break;
            }

            float n1 = 0;
            // Proviamo a convertire la stringa in un numero float
            try {
                n1 = Float.parseFloat(primoInput);
            } catch (NumberFormatException e) {
                System.out.println("Errore: Devi inserire un numero valido o 'esci'.");
                continue; // Salta il resto del ciclo e ricomincia da capo
            }

            System.out.print("Inserisci l'operazione (+, -, *, /, ^, sin, cos, tan): ");
            String operazione = input.next().toLowerCase();

            float n2 = 0;
            // Chiediamo il secondo numero solo se NON è una funzione trigonometrica
            if (!operazione.equals("sin") && !operazione.equals("cos") && !operazione.equals("tan") && !operazione.equals("history")) {
                System.out.print("Inserisci il secondo numero: ");
                try {
                    n2 = input.nextFloat();
                } catch (Exception e) {
                    System.out.println("Errore: Numero non valido.");
                    input.nextLine(); // Pulisce il buffer dello scanner per evitare loop infiniti di errori
                    continue;
                }
            }

            // Variabile per capire se stampare il risultato alla fine
            boolean operazioneValida = true;

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
                    miaCalcolatrice.sin(n1);
                    break;
                case "cos":
                    miaCalcolatrice.cos(n1);
                    break;
                case "tan":
                    miaCalcolatrice.tan(n1);
                    break;
                case "history":
                    System.out.println(miaCalcolatrice.toString());
                    break;
                default:
                    System.out.println("Operazione non riconosciuta!");
                    operazioneValida = false;
                    break;
            }

            // Stampa il risultato solo se non ci sono stati errori nell'operazione
            if (operazioneValida) {
                System.out.println("Risultato: " + miaCalcolatrice.getLastResult());
            }
        } // Fine del ciclo while

        // Chiudiamo lo scanner solo alla fine di tutto il programma
        input.close();
    }
}