package com.example.javabasics.operators;

/* Gli operatori in Java sono simboli speciali utilizzati per eseguire operazioni su variabili e
valori. Possono essere suddivisi in diverse categorie, tra cui operatori aritmetici, operatori di
 confronto, operatori logici e altri. Ecco una spiegazione e alcuni esempi di operatori in Java:

Operatori Aritmetici:

+ (Addizione): Somma due valori.
- (Sottrazione): Sottrae il secondo valore dal primo.
* (Moltiplicazione): Moltiplica due valori.
/ (Divisione): Divide il primo valore per il secondo.
% (Resto): Restituisce il resto di una divisione.
Esempio: */

public class Operators {
    // Metodo per eseguire operazioni matematiche
    public int somma(int a, int b) {
        return a + b;
    }

    public int sottrazione(int a, int b) {
        return a - b;
    }

    public int moltiplicazione(int a, int b) {
        return a * b;
    }

    public double divisione(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Errore: Divisione per zero.");
            return Double.NaN; // Not-a-Number (NaN)
        }
    }

    // Metodo per calcolare il resto
    public int resto(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Operators calcolatrice = new Operators();

        int risultatoSomma = calcolatrice.somma(5, 3);
        System.out.println("Somma: " + risultatoSomma);

        int risultatoSottrazione = calcolatrice.sottrazione(10, 4);
        System.out.println("Sottrazione: " + risultatoSottrazione);

        int risultatoMoltiplicazione = calcolatrice.moltiplicazione(7, 2);
        System.out.println("Moltiplicazione: " + risultatoMoltiplicazione);

        double risultatoDivisione = calcolatrice.divisione(20.0, 5.0);
        System.out.println("Divisione: " + risultatoDivisione);

        int risultatoResto = calcolatrice.resto(15, 4);
        System.out.println("Resto: " + risultatoResto);
    }
}
