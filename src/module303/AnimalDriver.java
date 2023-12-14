package module303;

public class AnimalDriver {
    public static void main(String[] args) {

        //Create animal objects:
        //The new keyword is used to create a new object
        // instance is another name for object
         /* Animal is the class, dog is the object that is
        derived from that class and the new operator is used
        to allocate memory in the heap.
         */

        Animal dog = new Animal();
        dog.setName("Dog");
        dog.setLevel(2);
        dog.setAlive(true);
        dog.setType("Canine");
        dog.setColor("Brown");

        //Cannot do this with primitives:
        /*Primitives are stored in stack memory and the
        primitive variables store the actual values; reference
        types are stored on heap memory and they 'point'
        to the place in memory
         */
    }
}
