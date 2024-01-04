package module303;

public class WrapperExamples {


    public static void main(String[] args) {
        int myValue = 12;
        Integer myObject = Integer.valueOf(122);
        // Integer myObject(value) deprecated

//        myObject = myValue;
        myValue = myObject;
        System.out.println(myObject + " "+ myValue);
        Double d = 23.23;
        double dd = d;

        //Max value of an integer:
        int maxValue = Integer.MAX_VALUE;

        String myStringValue = "121";
        int inputtedValue = Integer.parseInt(myStringValue);

        String myBinary = Integer.toBinaryString(myValue);
        System.out.print(myBinary);





    }
}
