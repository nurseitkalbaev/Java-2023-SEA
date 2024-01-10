package module303;

public class Car {
    private String make ;
    private String model;
    private int year;
    private double engineSize;
    private String color;

    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setCar(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void setColor(String color){
        this.color = color;
    }
}
