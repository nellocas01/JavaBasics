package com.example.javabasics.abstraction;

/*
* Astrazione è uno dei principi fondamentali dell'Orientamento agli Oggetti e si riferisce alla capacità
* di nascondere i dettagli di implementazione e fornire un'interfaccia semplificata per l'interazione
* con un oggetto o una classe. In Java, l'astrazione può essere implementata attraverso classi
* astratte e interfacce.
* Ecco un esempio di astrazione in Java utilizzando classi astratte e interfacce:
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

/* ********************** Spiegazione:

Veicolo è una classe astratta con un metodo astratto getTipo() che deve essere implementato
 dalle sue sottoclassi.
 La classe astratta può anche avere metodi concreti (come avvia() nel tuo caso) con
  un'implementazione predefinita che può essere ereditata dalle sottoclassi.

Auto e Moto sono due sottoclassi di Veicolo. Ognuna di queste sottoclassi implementa il
metodo astratto getTipo() in modo specifico per restituire il tipo di veicolo ("Auto" o "Moto").

Nel metodo main, vengono creati due oggetti, veicolo1 e veicolo2, di tipo Veicolo. Tuttavia,
 poiché Veicolo è una classe astratta, non è possibile crearne direttamente oggetti. Invece,
 vengono creati oggetti delle sottoclassi Auto e Moto, ma vengono assegnati a variabili di tipo Veicolo.

Successivamente, vengono chiamati i metodi getTipo() e avvia() sugli oggetti veicolo1 e `veicolo2. */