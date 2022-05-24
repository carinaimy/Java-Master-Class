package Carinaxiong;

public class Main {
    public static void main(String[] args) {

        //Objects - field
        //Like a computer, microphone, door...
        //state - hard drive
        //ant age, number of legs
        //behavior - drawing pictures // methods
        //class - like a template for blueprint, user define type

        //create object
        //have to initialize it
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        //cannot access private variables if we
        //call model directly
        System.out.println(porsche.getModel());

        //challenge - bank account


    }
}