package PracticeAssignment;

public class PizzaDriver {
    public static void main(String[] args) {
        PizzaOrder orderNurseit = new PizzaOrder();

        Pizza myPizza = new Pizza();
        myPizza.setPizzaSize("l");
        myPizza.setHamToppings(2);
        myPizza.setPepperoniToppings(1);
        myPizza.setCheeseToppings(1);
        System.out.println(myPizza.getDescription());
        System.out.println("your pizza price is :$"+myPizza.calcCost());
        orderNurseit.PizzaOrder(myPizza);

        Pizza myPizza2 = new Pizza();
        orderNurseit.PizzaOrder(myPizza2);
        myPizza2.setPizzaSize("m");
        myPizza2.setHamToppings(1);
        myPizza2.setPepperoniToppings(1);
        myPizza2.setCheeseToppings(1);
        System.out.println(myPizza2.getDescription());
        System.out.println("your pizza price is :$"+myPizza2.calcCost());
        System.out.println("Your total is: $"+orderNurseit.calcTotal());




    }
}
