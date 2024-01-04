package module303;

public class PrintingOutputs {
    public static void main(String[] args) {
//        System.out.println("Per Scholas");
//        System.out.print("Apple ");
        System.out.print("total: ");

        double applePrice = 7;
        double quantity = 3;

        System.out.println(applePrice / quantity);
        System.out.printf("Total %.2f",applePrice / quantity);

        float n = 12.23f;
        String str = String.format("\n%.8f",n);
        System.out.println(str);
    }
}
