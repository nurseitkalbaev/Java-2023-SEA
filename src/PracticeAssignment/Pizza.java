package PracticeAssignment;

public class Pizza {

    private String pizzaSize;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;
    private int toppingsQuantity;



    //setters
    public void setPizzaSize(String pizzaSize){
         this.pizzaSize = pizzaSize;
    }

    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }


    // getters

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    // methods

    public double calcCost(){
        double toppingsTotal = (cheeseToppings + pepperoniToppings + hamToppings) * 2 ;
        double pizzaSizePrice = 0;
        if(pizzaSize.equalsIgnoreCase("s")) pizzaSizePrice = 10.0;
        else if(pizzaSize.equalsIgnoreCase("m")) pizzaSizePrice = 12.0;
        else if(pizzaSize.equalsIgnoreCase("l")) pizzaSizePrice = 14.0;

        return toppingsTotal + pizzaSizePrice;
    }

    public String getDescription(){
        String size = "Your pizza size is "+pizzaSize;
        String cheese = "Cheese toppings :"+cheeseToppings;
        String pepperoni = "Pepperoni toppings :"+pepperoniToppings;
        String ham = "Ham toppings :"+hamToppings;
        return size +", "+ cheese +", "+ pepperoni +", "+ ham;

    }


}
