package Carinaxiong;

public class Car {
    //access modifier: public - un-restrict
    //Other class has access to this class
    //private - encapsulate, hidden from view, no outside access

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    //create a method update the model.
    public void setModel(String model){
        //this. referring the field of class
        //the above one!
        String validModel = model.toLowerCase();
        //validation with rules
        if(validModel.equals("carrera")||validModel.equals(("commodore"))){
            this.model = model;
        }
        else{
            this.model = "unknown";
        }
    }

    //getter
    public String getModel(){
        return this.model;
    }








}
