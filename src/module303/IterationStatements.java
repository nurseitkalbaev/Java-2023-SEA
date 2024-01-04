package module303;

public class IterationStatements {

    public static void main(String[] args) {
        int b = 0;
        while (b < 20){
            System.out.println("Bye bye! " + b);
            b++;
            if(b ==10) break;

        }
        for(int i = 0; i <= 100; i++){
            System.out.println("Welcome to Java! " + i +" " );
            if(i == 13){
                return;
            }
        }





    }
}
