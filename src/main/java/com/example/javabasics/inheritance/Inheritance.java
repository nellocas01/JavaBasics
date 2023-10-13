package com.example.javabasics.inheritance;

/* In Java, l'ereditarietà consente di creare una sottoclasse (classe figlia)
che eredita attributi e metodi da una superclasse (classe genitore).
La extendsparola chiave viene utilizzata per indicare questa relazione.

Nell'esempio fornito, la Carclasse è la sottoclasse ed eredita attributi e
metodi dalla Vehicleclasse, che è la superclasse. Ecco una spiegazione del codice */
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

Vehicleè la superclasse ed Carè la sottoclasse.
La extendsparola chiave viene utilizzata per indicare che la Carclasse eredita dalla Vehicleclasse.
La Carclasse ha un attributo aggiuntivo modelNamespecifico per essa.
Nel mainmetodo, un oggetto della Carclasse ( myCar) viene creato e utilizzato per chiamare
il honkmetodo ereditato e accedere agli attributi di entrambe le classi.
Ciò dimostra come l'ereditarietà consenta di creare una gerarchia di classi, promuovendo
la riusabilità del codice e strutturando il programma in base alle relazioni tra oggetti. */