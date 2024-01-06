package PracticeAsignment;

public class PredictFutureTuition {
    public static void main(String[] args) {
        final int tuition = 10000;
        double doubleTuition = tuition;
        final double yearlyPriceIncrease = 0.07;
        int yearsToIncrease = 1;
        while(doubleTuition <= tuition * 2){
            doubleTuition +=   (doubleTuition * yearlyPriceIncrease);
            yearsToIncrease++;
        }
        System.out.println("Tuition will be doubled in: "+yearsToIncrease + " years");
    }
}
