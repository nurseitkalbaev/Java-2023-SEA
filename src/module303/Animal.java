package module303;

public class Animal {
    /*attributes (fields) - variables that describe or say something
     about the animal;
      */
    static String animalGame = "Nurseit's Animal Game";

    String name;

    String type;
    int level;

    String color;

    boolean alive;

    //Behavior - methods that describe or show behavior an animal.

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setLevel(int level){
        this.level = level;
    }
    public void setAlive(boolean alive){
        this.alive = alive;
    }
    public void setColor(String color){
        this.color = color;
    }

}
