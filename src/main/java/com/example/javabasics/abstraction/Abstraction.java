package com.example.javabasics.abstraction;

/*
*Astrazione è uno dei principi fondamentali dell'Orientamento agli Oggetti e si riferisce alla capacità
* di nascondere i dettagli di implementazione e fornire un'interfaccia semplificata per l'interazione
* con un oggetto o una classe. In Java, l'astrazione può essere implementata attraverso classi
* astratte e interfacce.
* Ecco un esempio di astrazione in Java utilizzando classi astratte e interfacce:
* Esempio 1: Astrazione con una Classe Astratta
* */

// Classe astratta che rappresenta un veicolo
abstract class Veicolo {
    // Metodo astratto per ottenere il tipo di veicolo
    public abstract String getTipo();

    // Metodo concreto con implementazione predefinita
    public void avvia() {
        System.out.println("Il veicolo è stato avviato.");
    }
}

// Sottoclasse che estende la classe astratta Veicolo
class Auto extends Veicolo {
    public String getTipo() {
        return "Auto";
    }
}

// Sottoclasse che estende la classe astratta Veicolo
class Moto extends Veicolo {
    public String getTipo() {
        return "Moto";
    }
}

public class Abstraction {

    public static void main(String[] args) {
        Veicolo veicolo1 = new Auto();
        Veicolo veicolo2 = new Moto();

        System.out.println(veicolo1.getTipo()); // Output: Auto
        veicolo1.avvia(); // Output: Il veicolo è stato avviato

        System.out.println(veicolo2.getTipo()); // Output: Moto
        veicolo2.avvia(); // Output: Il veicolo è stato avviato
    }
}

