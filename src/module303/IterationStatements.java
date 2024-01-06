package module303;

import java.util.ArrayList;

public class IterationStatements {

    public static void main(String[] args) {
        int b = 0;
        while (b < 20){
//            System.out.println("Bye bye! " + b);
            b++;
            if(b ==10) break;

        }
        for(int i = 0; i <= 100; i++){
//            System.out.println("Welcome to Java! " + i +" " );
            if(i == 13){
                break;
            }
        }

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Nurseit");
        arrayList.add("Soloni");
        arrayList.add("Guled");
        arrayList.add("Marta");

        for(int i = 0; i < arrayList.size(); i++){
//            System.out.println(arrayList.get(i));
        }
        for(String name: arrayList){
//            System.out.println(name);
        }

        // do while loops uses in case if you want to ask user for input.
        int i = 0;
        do{
//            System.out.println(i);
            i++;
        }while(i <= 10);

        // break || continue examples
        int sum = 0;
        int num =0;
        while( num < 20){
            num+=2;
            if(num ==3 || num ==4){
                break;

            }
            System.out.println("num "+ num);
            sum += num;
        }





    }
}
