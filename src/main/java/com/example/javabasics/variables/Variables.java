package com.example.javabasics.variables;

/* In  Java, le variabili sono elementi fondamentali utilizzati per
memorizzare dati. Le variabili possono rappresentare una vasta gamma di
informazioni, inclusi numeri, testi, oggetti e altro. Ci sono diversi tipi di variabili
in Java, tra cui variabili locali, variabili di istanza e variabili statiche.

Ecco un esempio di come dichiarare e utilizzare variabili in Java: */

public class Variables {
    // Variabili di istanza
    String nome;    // Variabile di istanza di tipo String
    int età;        // Variabile di istanza di tipo int
    float importo;  // Variabile di istanza di tipo float
    char iniziale;  // Variabile di istanza di tipo char
    boolean isSoleilSunny;  // Variabile di istanza di tipo boolean

    // Variabile statica
    static int contatore = 10;

    public static void main(String[] args) {
        // Variabile locale
        int numero = 42;  // Variabile locale di tipo int

        // Creiamo un oggetto
        Variables persona = new Variables();

        // Assegniamo valori alle variabili di istanza
        persona.nome = "Alice";
        persona.età = 30;
        persona.importo = 19.99f; // Nota l'uso del suffisso 'f' per indicare un float
        persona.iniziale = 'A';   // Nota l'uso dei singoli apici per i char
        persona.isSoleilSunny = true;

        // Modifichiamo la variabile statica
        contatore++;

        // Stampiamo il contenuto delle variabili
        System.out.println("Nome: " + persona.nome);  // Output: Nome: Alice
        System.out.println("Età: " + persona.età);    // Output: Età: 30
        System.out.println("Importo: " + persona.importo);  // Output: Importo: 19.99
        System.out.println("Iniziale: " + persona.iniziale);  // Output: Iniziale: A
        System.out.println("Is Soleil Sunny: " + persona.isSoleilSunny);  // Output: Is Soleil Sunny: true
        System.out.println("Numero: " + numero);  // Output: Numero: 42
        System.out.println("Contatore: " + contatore);  // Output: Contatore: 1
    }
}



/* spiegazione:

In questo esempio, dichiariamo variabili di diversi tipi:

nome e età sono variabili di istanza (proprietà) di un oggetto di tipo VariabiliEsempio.

contatore è una variabile statica che appartiene alla classe VariabiliEsempio.

numero è una variabile locale definita nel metodo main.

Nel metodo main, creiamo un oggetto VariabiliEsempio chiamato persona.

Assegniamo valori alle variabili di istanza nome e età dell'oggetto persona.

Modifichiamo la variabile statica contatore incrementandola di 1.

Stampiamo il contenuto delle variabili utilizzando il metodo System.out.println().

numero è una variabile locale all'interno del metodo main e contiene il valore 42.

contatore è una variabile statica condivisa da tutte le istanze di VariabiliEsempio e tiene
 traccia del numero di istanze create.

In breve, questo esempio dimostra come dichiarare variabili di istanza, variabili statiche e
variabili locali in Java. Le variabili di istanza sono specifiche di un oggetto particolare,
le variabili statiche sono condivise tra tutte le istanze di una classe e le variabili locali
sono definite all'interno di un metodo e hanno un ambito limitato a quel metodo. */