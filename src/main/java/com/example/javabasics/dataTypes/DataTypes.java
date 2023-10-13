package com.example.javabasics.dataTypes;


import java.util.Arrays;

import java.util.Arrays;

import java.util.Arrays;

/* in Java, i tipi di dati (data types) sono utilizzati per dichiarare variabili o oggetti
e definire quali tipi di valori possono essere memorizzati in essi. I tipi di dati in Java
possono essere suddivisi in due categorie principali: tipi di dati primitivi
 (primitive data types) e tipi di dati di riferimento (reference data types).

Ecco alcuni esempi di tipi di dati in Java:

Ecco un esempio di utilizzo di tipi di dati in Java: */


public class DataTypes {
    public static void main(String[] args) {
        // Tipi di dati primitivi
        byte valoreByte = 123;
        short valoreShort = 32000;
        int numeroIntero = 42;
        double numeroDecimale = 3.14159;
        float valoreFloat = 19.99f;  // Nota l'uso del suffisso 'f' per indicare un float
        boolean valoreBooleano = true;
        char carattere = 'A';
        long numeroLungo = 1234567890L;  // Nota l'uso del suffisso 'L' per indicare un long

        // Tipi di dati di riferimento
        String nome = "Alice";
        Object oggettoGenerico = new Object();

        // Tipi di dati complessi (array)
        int[] numeriInteri = {1, 2, 3, 4, 5};

        System.out.println("Valore byte: " + valoreByte);
        System.out.println("Valore short: " + valoreShort);
        System.out.println("Numero intero: " + numeroIntero);
        System.out.println("Numero decimale: " + numeroDecimale);
        System.out.println("Valore float: " + valoreFloat);
        System.out.println("Valore booleano: " + valoreBooleano);
        System.out.println("Carattere: " + carattere);
        System.out.println("Numero lungo: " + numeroLungo);
        System.out.println("Nome: " + nome);
        System.out.println("Oggetto generico: " + oggettoGenerico);
        System.out.println("Numeri interi: " + Arrays.toString(numeriInteri));
    }
}

/* Certamente, ecco una spiegazione dei tipi di dati inclusi nel codice:

1. **byte**: `byte` è un tipo di dato primitivo che rappresenta numeri interi con un
 raggio di -128 a 127. Nell'esempio, `valoreByte` è stato dichiarato come un `byte` con un valore di 123.

2. **short**: `short` è un tipo di dato primitivo che rappresenta numeri interi con un
raggio più ampio rispetto a `byte`. Nell'esempio, `valoreShort` è stato dichiarato come
un `short` con un valore di 32000.

3. **int**: `int` è un tipo di dato primitivo che rappresenta numeri interi. Nell'esempio,
`numeroIntero` è stato dichiarato come un `int` con un valore di 42.

4. **double**: `double` è un tipo di dato primitivo che rappresenta numeri decimali a virgola
 mobile con alta precisione. Nell'esempio, `numeroDecimale` è stato dichiarato come
 un `double` con un valore di 3.14159.

5. **float**: `float` è un tipo di dato primitivo che rappresenta numeri decimali a virgola
mobile con precisione limitata. Nell'esempio, `valoreFloat` è stato dichiarato come un `float`
con un valore di 19.99 e il suffisso 'f' viene utilizzato per indicare che è un valore `float`.

6. **boolean**: `boolean` è un tipo di dato primitivo che rappresenta valori booleani, che
possono essere `true` o `false`. Nell'esempio, `valoreBooleano` è stato dichiarato come un
`boolean` con un valore `true`.

7. **char**: `char` è un tipo di dato primitivo che rappresenta un singolo carattere Unicode.
Nell'esempio, `carattere` è stato dichiarato come un `char` con un valore 'A'.

8. **long**: `long` è un tipo di dato primitivo che rappresenta numeri interi molto grandi.
Nell'esempio, `numeroLungo` è stato dichiarato come un `long` con un valore di 1234567890L,
dove il suffisso 'L' viene utilizzato per indicare un valore `long`.

9. **String**: `String` è un tipo di dato di riferimento che rappresenta una sequenza di caratteri.
 Nell'esempio, `nome` è stato dichiarato come una variabile `String` con il valore "Alice".

10. **Object**: `Object` è un tipo di dato di riferimento che rappresenta un oggetto generico.
Nell'esempio, `oggettoGenerico` è stato dichiarato come una variabile `Object`.

11. **Array**: Gli array sono tipi di dati complessi che rappresentano una collezione di
elementi dello stesso tipo. Nell'esempio, `numeriInteri` è un array di interi con i valori {1, 2, 3, 4, 5}.

Il codice stampa i valori di queste variabili utilizzando `System.out.println()`,
 consentendo di visualizzare i valori dei diversi tipi di dati. */