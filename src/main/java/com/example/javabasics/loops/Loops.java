package com.example.javabasics.loops;

/* In Java, i cicli (loops) sono costrutti utilizzati per eseguire un blocco di istruzioni ripetutamente
fino a quando una condizione specifica viene soddisfatta. Ci sono principalmente tre tipi di cicli
in Java: for, while e do-while. Ecco una spiegazione e degli esempi di ciascun tipo di ciclo:

Ciclo for:

Il ciclo for è utilizzato quando sai in anticipo quante volte vuoi ripetere un blocco di codice.
È spesso usato per iterare su un insieme di valori.

Esempio:

for (int i = 1; i <= 5; i++) {
    System.out.println("Iterazione " + i);
}
In questo esempio, il ciclo for viene eseguito 5 volte, e in ogni iterazione viene stampato
il messaggio "Iterazione" seguito da un numero.

Ciclo while:

Il ciclo while viene utilizzato quando la condizione di uscita non è nota in anticipo e il
blocco di codice deve essere eseguito fintanto che la condizione è vera.

Esempio:

int contatore = 1;
while (contatore <= 5) {
    System.out.println("Iterazione " + contatore);
    contatore++;
}
In questo esempio, il ciclo while viene eseguito finché la variabile contatore è minore o uguale a 5.

Ciclo do-while:

Il ciclo do-while è simile al ciclo while, ma garantisce che il blocco di codice venga eseguito
 almeno una volta prima di verificare la condizione.

Esempio:

int contatore = 1;
do {
    System.out.println("Iterazione " + contatore);
    contatore++;
} while (contatore <= 5);
Anche in questo caso, il ciclo viene eseguito finché la variabile contatore è minore o uguale a 5,
 ma il blocco di codice viene sempre eseguito almeno una volta.

Questi sono esempi semplici di cicli in Java. I cicli sono utilizzati per automatizzare il processo
 di esecuzione di un blocco di codice più volte, rendendo il codice più efficiente ed elegante.
  Puoi anche annidare cicli all'interno di altri cicli per affrontare situazioni più complesse. */

public class Loops {
    public static void main(String[] args) {
        // Ciclo for
        System.out.println("Ciclo for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iterazione " + i);
        }

        // Ciclo while
        System.out.println("\nCiclo while:");
        int contatoreWhile = 1;
        while (contatoreWhile <= 5) {
            System.out.println("Iterazione " + contatoreWhile);
            contatoreWhile++;
        }

        // Ciclo do-while
        System.out.println("\nCiclo do-while:");
        int contatoreDoWhile = 1;
        do {
            System.out.println("Iterazione " + contatoreDoWhile);
            contatoreDoWhile++;
        } while (contatoreDoWhile <= 5);

        // Ciclo for-each su un array
        System.out.println("\nCiclo for-each su un array:");
        int[] numeri = {1, 2, 3, 4, 5, 6};
        for (int numero : numeri) {
            System.out.println(numero);
        }

        // Utilizzo del ciclo for con break e continue
        System.out.println("Ciclo for con break e continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Iterazione saltata (continue)");
                continue; // Salta questa iterazione
            }
            if (i == 4) {
                System.out.println("Terminazione anticipata (break)");
                break; // Esci dal ciclo
            }
            System.out.println("Iterazione " + i);
        }
    }
}

/* Questo esempio utilizza tutti e quattro i principali tipi di cicli in Java:

Il ciclo for stampa numeri da 1 a 5.
Il ciclo while fa la stessa cosa, ma con una variabile di controllo.
Il ciclo do-while stampa i numeri da 1 a 5 ed è garantito di eseguire almeno una volta.
Il ciclo "for-each" itera attraverso un array e stampa i suoi elementi.
BREAK E CONTINUE :
in questo esempio, utilizziamo un ciclo for che conta da 1 a 5. Tuttavia, aggiungiamo
condizioni con if per mostrare come break e continue possano influenzare il flusso del ciclo:

Quando i è uguale a 3, usiamo continue per saltare l'iterazione corrente e passare alla successiva.
Quando i è uguale a 4, usiamo break per uscire anticipatamente dal ciclo.
Eseguendo questa classe, otterrai un output che mostra come break e continue possono essere
utilizzati per controllare il flusso di esecuzione all'interno di un ciclo for.
Eseguendo questa classe, otterrai un output che dimostra l'uso di tutti questi tipi di cicli. */