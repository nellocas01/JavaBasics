package com.example.javabasics.methods;

/* In Java, i metodi sono blocchi di codice che eseguono una serie di istruzioni
specifiche quando vengono chiamati. I metodi consentono di organizzare il codice in
unità più piccole e riutilizzabili, rendendo il codice più leggibile.
 Ecco una spiegazione e un esempio di come funzionano i metodi in Java:

Sintassi di base:

tipo_di_ritorno nomeDelMetodo(parametri) {
    // Corpo del metodo
    // Esecuzione delle istruzioni
    return valore_di_ritorno; // opzionale
}

tipo_di_ritorno: Specifica il tipo di dato che il metodo restituirà come risultato.

Se il metodo non restituisce un valore, il tipo di ritorno è void.

nomeDelMetodo: È il nome del metodo.

parametri: Sono gli eventuali dati di input che il metodo riceve. I parametri sono
separati da virgole.

valore_di_ritorno: Se il metodo restituisce un valore, l'istruzione return viene utilizzata
per restituirlo. Il tipo di ritorno del valore deve corrispondere al tipo di ritorno dichiarato nel metodo.

Ecco un esempio di un semplice metodo che calcola la somma di due numeri: */

public class Methods {
    public static void main(String[] args) {
        saluta("Alice");
        saluta("Bob");
        saluta("Jimmy");
    }

    // Metodo che saluta una persona
    public static void saluta(String nome) {
        System.out.println("Ciao, " + nome + "!");
    }
}

/*
In questo esempio, abbiamo un metodo statico chiamato saluta che prende un
parametro di tipo String chiamato nome. Nel metodo main, chiamiamo il metodo
 saluta due volte, passando i nomi "Alice" e "Bob". Il metodo saluta, stampa un
 saluto personalizzato utilizzando il nome passato come argomento. */