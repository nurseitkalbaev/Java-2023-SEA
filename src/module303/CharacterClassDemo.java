package module303;

public class CharacterClassDemo {
    public static void main(String[] args){
        char letter = 'g';
        char num = '7';
        int number = 3;
        Character letter2 = Character.valueOf('g');
        Character num2 = Character.valueOf('7');

        //if character is a digit:
        boolean isADigit = Character.isDigit(letter);
        boolean isALetter = Character.isLetter(letter);
        System.out.println("is a Digit: "+ isADigit + " " + isALetter);
    }
}
