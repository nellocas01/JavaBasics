package com.example.javabasics.clas;


/* In Java, la parola chiave class è utilizzata per definire una classe.
Una classe è un modello o un tipo di oggetto che descrive le proprietà (campi o variabili)
 e i comportamenti (metodi) che gli oggetti di quella classe avranno. Le classi sono
 fondamentali nell'orientamento agli oggetti e sono utilizzate per creare oggetti,
 che sono le istanze di una classe.

Ecco un esempio di come definire una classe in Java: */

public class Class {
    // Campi (variabili) della classe
    String nome;
    int età;

    // Costruttore
    public Class(String nome, int età) {
        this.nome = nome;
        this.età = età;
    }

    // Metodi della classe
    public void saluta() {
        System.out.println("Ciao, mi chiamo " + nome + " e ho " + età + " anni.");
    }

    public void festeggiaCompleanno() {
        età++;
    }

    public static void main(String[] args) {
        // Creazione di un oggetto Persona
        Class persona1 = new Class("Alice", 30);

        // Chiamata ai metodi dell'oggetto
        persona1.saluta();  // Output: Ciao, mi chiamo Alice e ho 30 anni.
        persona1.festeggiaCompleanno();
        persona1.saluta();  // Output: Ciao, mi chiamo Alice e ho 31 anni.
    }
}

/* Spiegazione:

Inizia dichiarando una classe chiamata Persona utilizzando la parola chiave class.
All'interno della classe, puoi dichiarare campi (variabili di istanza), costruttori e metodi.

La classe Persona ha due campi, nome (di tipo String) ed età (di tipo int), che rappresentano
le proprietà di un oggetto di tipo Persona.

Il costruttore Persona è un metodo speciale che viene chiamato quando viene creato un nuovo
 oggetto di tipo Persona. Accetta due parametri, nomeedetà`, e inizializza i campi della classe con i valori passati.

La classe Persona ha due metodi, saluta() e festeggiaCompleanno(). Il metodo saluta()
stampa un messaggio di saluto che include il nome e l'età dell'oggetto Persona, mentre
il metodo festeggiaCompleanno() incrementa l'età di una persona.

Nel metodo main, creiamo un oggetto Persona chiamato persona1, inizializzandolo con il nome
 "Alice" e un'età di 30 anni.

Utilizziamo i metodi dell'oggetto persona1, chiamando saluta() per stampare un messaggio
di saluto e festeggiaCompleanno() per aumentare l'età.

In sintesi, una classe in Java definisce un modello per gli oggetti che possono essere
creati da essa. Le classi sono utilizzate per organizzare il codice in modo che le proprietà
e i comportamenti correlati siano raggruppati insieme, e gli oggetti istanziati da una classe
 possono interagire tra loro utilizzando i metodi definiti nella classe. */