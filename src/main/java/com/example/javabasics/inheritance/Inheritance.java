package com.example.javabasics.inheritance;

/* In Java, l'ereditarietà consente di creare una sottoclasse (classe figlia)
che eredita attributi e metodi da una superclasse (classe genitore).
La extends parola chiave viene utilizzata per indicare questa relazione.

Nell'esempio fornito, la Car-classe è la sottoclasse ed eredita attributi e
metodi dalla Inheritance-classe, che è la superclasse. Ecco una spiegazione del codice */
public class Inheritance {
    protected String brand = "Ford";  // Attribute in the superclass
    public void honk() {  // Method in the superclass
        System.out.println("Beep, beep!");
    }
}

class Car extends Inheritance {
    private String modelName = "Mustang";  // Additional attribute in the subclass
    public static void main(String[] args) {
        Car myCar = new Car();  // Create an object of the Car class
        myCar.honk();  // Call the inherited method from the Vehicle class
        System.out.println(myCar.brand + " " + myCar.modelName);  // Access attributes from both classes
    }
}

/* In questo esempio:

Inheritance è la superclasse e Car è la sottoclasse.
La extends parola chiave viene utilizzata per indicare che la Car-classe eredita dalla Inheritance-classe.
La Car-classe ha un attributo aggiuntivo modelNamespecifico per essa.
Nel main-metodo, un oggetto della Car-classe ( myCar) viene creato e utilizzato per chiamare
il honk-metodo ereditato e accedere agli attributi di entrambe le classi.
Ciò dimostra come l'ereditarietà consenta di creare una gerarchia di classi, promuovendo
la riusabilità del codice e strutturando il programma in base alle relazioni tra oggetti. */