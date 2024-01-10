package PracticeAssignment;

public class PizzaOrder{
    private double orderTotal;
    private Pizza [] pizzas = new Pizza[3];

    private int pizzaCount;
    public PizzaOrder (){

    }

    public void PizzaOrder(Pizza pizza){
        pizzaCount++;
        if(pizzaCount > 3){
            System.out.println("Your maximum limit to order pizzas reached! Please make new order!");
        }
        for(int i = 0; i < pizzaCount; i ++){
            pizzas[i] = pizza;
        }
    }


    public double calcTotal(){
        for(int i = 0; i < pizzaCount; i++){
            orderTotal += pizzas[i].calcCost();
        }
        return orderTotal;
    }


}
