package com.example.javabasics.encapsulation;


/* L'incapsulamento (encapsulation) è uno dei principi fondamentali dell'orientamento agli oggetti
ed è una tecnica che consente di nascondere i dettagli interni di un oggetto e di esporre solo le
 ùfunzionalità pubbliche attraverso metodi e campi (variabili) pubblici. In Java, l'incapsulamento
 è ampiamente utilizzato per garantire che gli oggetti mantengano uno stato coerente e per ridurre
 la complessità del codice.

Ecco un esempio di incapsulamento in Java con una spiegazione:

Esempio di Incapsulamento: */

 class Persona {
    private String nome;   // Campo privato
    private int eta;        // Campo privato

    // Costruttore
    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // Metodo pubblico per ottenere il nome
    public String getNome() {
        return nome;
    }

    // Metodo pubblico per impostare il nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Metodo pubblico per ottenere l'eta
    public int getEta() {
        return eta;
    }

    // Metodo pubblico per impostare l'eta con una validazione
    public void setEta(int eta) {
        if (eta >= 0) {
            this.eta = eta;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Persona persona = new Persona("Alice", 30);

        // Utilizziamo i metodi pubblici per accedere ai campi privati
        System.out.println("Nome: " + persona.getNome()); // Output: Nome: Alice
        System.out.println("Eta: " + persona.getEta());   // Output: Eta: 30

        // Modifichiamo il nome e l'eta utilizzando i metodi pubblici
        persona.setNome("Bob");
        persona.setEta(25);

        System.out.println("Nuovo nome: " + persona.getNome()); // Output: Nuovo nome: Bob
        System.out.println("Nuova eta: " + persona.getEta());   // Output: Nuova eta: 25
    }
}

/* ****************Spiegazione:

Nella classe Persona, i campi nome ed età sono dichiarati come privati (private),
il che significa che non sono accessibili direttamente da altre classi.

Abbiamo definito metodi pubblici (getNome, setNome, getEtà, setEtà) che consentono
di accedere ai campi privati in modo controllato.

Il metodo getNome restituisce il valore del campo nome, mentre setNome consente di
impostare il valore di nome.

Il metodo getEtà restituisce il valore del campo età, mentre setEtà consente di
impostare il valore di `età con una validazione che assicura che l'età sia un valore non negativo.

Nella funzione main, creiamo un oggetto Persona e utilizziamo i metodi pubblici per
accedere e modificare i campi privati.

L'incapsulamento ci consente di mantenere il controllo sui dati all'interno di un oggetto,
di applicare validazioni, di evitare accessi non autorizzati e di fornire un'interfaccia
pubblica ben definita per interagire con l'oggetto. */
