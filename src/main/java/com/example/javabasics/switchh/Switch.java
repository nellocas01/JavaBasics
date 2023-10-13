package com.example.javabasics.switchh;

/* In Java, l'istruzione switch è una costruzione di controllo che consente di eseguire
una delle molteplici azioni basate sul valore di una singola espressione. È spesso
utilizzata quando si ha una singola variabile e si desidera eseguire diverse azioni in
base a diversi valori possibili di quella variabile. Ecco una spiegazione e un esempio
di come funziona l'istruzione switch:

Sintassi di base:

java
Copy code
switch (espressione) {
    case valore1:
        // Blocco di codice da eseguire quando l'espressione è uguale a valore1
        break;

    case valore2:
        // Blocco di codice da eseguire quando l'espressione è uguale a valore2
        break;

    // Altri casi...

    default:
        // Blocco di codice da eseguire se nessun caso corrisponde all'espressione
}
L'espressione è la variabile o l'espressione valutata di cui si desidera controllare il valore.
I case definiscono i diversi valori possibili che l'espressione può assumere e specificano il
blocco di codice da eseguire quando l'espressione è uguale a quel valore.
Il blocco di codice all'interno di ciascun case viene eseguito fino a quando si raggiunge
l'istruzione break o la fine del blocco switch.
Ecco un esempio con un caso switch che determina il giorno della settimana in base a un numero: */


public class Switch {
    public static void main(String[] args) {
        int giorno = 75;

        switch (giorno) {
            case 1:
                System.out.println("Lunedì");
                break;
            case 2:
                System.out.println("Martedì");
                break;
            case 3:
                System.out.println("Mercoledì");
                break;
            case 4:
                System.out.println("Giovedì");
                break;
            case 5:
                System.out.println("Venerdì");
                break;
            case 6:
            case 7:
                System.out.println("Fine settimana");
                break;
            default:
                System.out.println("Valore non valido");
        }
    }
}

/* In questo esempio, la variabile giorno è impostata su 3, e l'istruzione switch d
etermina che è mercoledì e stampa "Mercoledì". Se il valore non corrisponde a nessun caso,
viene eseguito il blocco di codice del caso default.

L'istruzione switch è utile quando si desidera selezionare tra diverse opzioni basate su
un valore specifico e offre un modo più efficiente per farlo rispetto a una serie di
istruzioni if-else nidificate. */