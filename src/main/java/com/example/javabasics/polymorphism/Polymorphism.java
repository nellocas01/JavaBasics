package com.example.javabasics.polymorphism;



/* Il polimorfismo è un concetto chiave nell'orientamento agli oggetti che consente
 a oggetti di classi diverse di rispondere in modo simile a un determinato messaggio
  o comportamento. Il polimorfismo in Java è spesso implementato attraverso l'ereditarietà,
   l'uso di classi astratte, interfacce e il concetto di override dei metodi.

Ecco un esempio di polimorfismo in Java con una spiegazione:

Esempio di Polimorfismo: */




// Classe base (superclasse)
class Animale {
    public void emettiSuono() {
        System.out.println("Questo è un suono generico di un animale.");
    }
}

// Sottoclasse 1
class Cane extends Animale {
    @Override
    public void emettiSuono() {
        System.out.println("Il cane abbaia: Woof!");
    }
}

// Sottoclasse 2
class Gatto extends Animale {
    @Override
    public void emettiSuono() {
        System.out.println("Il gatto fa il verso: Meow!");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        // Creazione di oggetti di diverse sottoclassi
        Animale cane = new Cane();
        Animale gatto = new Gatto();

        // Chiamata al metodo emettiSuono() sui diversi oggetti
        cane.emettiSuono(); // Output: Il cane abbaia: Woof!
        gatto.emettiSuono(); // Output: Il gatto fa il verso: Meow!
    }
}

/* *********** Spiegazione:

Abbiamo una classe base Animale con un metodo emettiSuono() che fornisce una descrizione generica del suono
di un animale.

Successivamente, abbiamo due sottoclassi: Cane e Gatto, entrambe estendono Animale e sovrascrivono il metodo
 emettiSuono() per fornire implementazioni specifiche.

Nel metodo main, creiamo due oggetti: uno di tipo Cane e l'altro di tipo Gatto, ma li dichiariamo come oggetti
 di tipo Animale. Questo è ciò che rende il polimorfismo possibile. Anche se sono oggetti di classi diverse,
 possono essere trattati in modo simile come oggetti Animale.

Chiamiamo il metodo emettiSuono() su entrambi gli oggetti. Anche se il tipo statico è Animale, il metodo chiamato
è determinato in fase di esecuzione in base al tipo dinamico dell'oggetto. Di conseguenza, otteniamo l'output
 specifico di ciascuna sottoclasse (Cane o Gatto).

Questo è un esempio di polimorfismo in Java, in cui oggetti di classi diverse possono rispondere al medesimo
 messaggio (emettiSuono()) in modo diverso, a seconda del loro tipo dinamico. */
