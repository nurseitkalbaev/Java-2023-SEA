package PracticeAssignment;

public class MultiplicationTable {
    public static void main(String[] args) {
        // PA 303.5.1 - Practice Assignment - Loops. Problem 1

        int multiplier = 12;
        int math = 0;
        int numLen = 0;
        for(int i = 1; i <= multiplier; i++){
            for(int j = 1; j <=multiplier; j++ ){
                math = j * i;
                numLen = String.valueOf(math).length();
                // adding logic to make even columns between nums
                if(numLen == 1 )System.out.print("    "+math);
                else if(numLen == 2 )System.out.print("   "+math);
                else if(numLen == 3 )System.out.print("  "+math);

            }
            System.out.println(" ");
        }
    }
}
