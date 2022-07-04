package Carinaxiong;

//inheritance Animal Class use EXTENDS
public class Dog extends Animal{

    //extra fields relate to dog
    private int eyes;
    private int legs;
    private  int tail;
    private int teeth;
    private String coat;

    //constructor
    public Dog(  int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        //super: call constructor we extend from
        //if it's confirmed, we can use the default value here
        //instead, we use new parameters inside the constructor
        super(1, 1, size, weight, name);
        //we can add some features, extra behavior, methods, etc.
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth =teeth;
        this.coat = coat;

    }

    //we can override the method from Animal too

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called.");
        chew();
        //super class Animal eat method
        super.eat();
    }


    public void walk(){
        System.out.println("Dog.walk called");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run called");
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move called");
        moveLegs(speed);
        super.move(speed);
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs called");


    }
}
