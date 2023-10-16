package com.example.javabasics.object;

/* In Java, Object è la classe radice di tutte le classi. Ogni classe in Java
 è implicitamente una sottoclasse di Object. La classe Object fornisce metodi comuni
  che sono ereditati da tutte le altre classi. Questi metodi includono
  equals(), hashCode(), toString(), getClass(), notify(), notifyAll(), e wait().

Ecco un esempio che illustra l'uso della classe Object in Java: */

public class Object {
    public static void main(String[] args) {
        // Creiamo due oggetti di tipo String
        String str1 = "Hello";
        String str2 = "World";

        // Utilizziamo il metodo equals() per confrontare gli oggetti
        boolean sonoUguali = str1.equals(str2);
        System.out.println("str1.equals(str2): " + sonoUguali);

        // Utilizziamo il metodo hashCode() per ottenere l'hash code di un oggetto
        int hashCodeStr1 = str1.hashCode();
        System.out.println("HashCode di str1: " + hashCodeStr1);

        // Utilizziamo il metodo toString() per ottenere una rappresentazione in stringa di un oggetto
        String str1ToString = str1.toString();
        System.out.println("str1.toString(): " + str1ToString);

        // Utilizziamo il metodo getClass() per ottenere la classe di un oggetto
        Class<? extends String> str1Class = str1.getClass();
        System.out.println("Classe di str1: " + str1Class.getName());

        // Utilizziamo il metodo notify() e wait() per la sincronizzazione tra thread
        Object lock = new Object();
        synchronized (lock) {
            try {
                lock.wait(1000);  // Sospende il thread per 1 secondo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.notify();  // Sveglia un thread in attesa
        }
    }
}

/* Spiegazione:

Creiamo due oggetti di tipo String chiamati str1 e str2.

Usiamo il metodo equals() per confrontare i due oggetti str1 e str2. Questo metodo confronta
il contenuto delle stringhe e restituisce true se sono uguali.

Utilizziamo il metodo hashCode() per ottenere l'hash code dell'oggetto str1. Questo
 è un numero intero che rappresenta un identificatore unico per l'oggetto.

Il metodo toString() restituisce una rappresentazione in formato stringa dell'oggetto.
 In questo caso, otteniamo una stringa che contiene il contenuto di str1.

Il metodo getClass() restituisce l'oggetto Class associato all'oggetto. In questo caso,
otteniamo la classe della stringa str1.

Utilizziamo il metodo notify() e wait() per la sincronizzazione tra thread. Questi metodi
 sono utilizzati per la comunicazione tra thread e la gestione della concorrenza.

In sintesi, la classe Object fornisce una serie di metodi comuni che sono ereditati da tutte
le altre classi in Java. Questi metodi possono essere utili per operazioni come il confronto
 di oggetti, la generazione di codici hash, la rappresentazione in formato stringa e la
 gestione della concorrenza. */