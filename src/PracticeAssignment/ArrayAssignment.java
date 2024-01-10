package PracticeAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment {
    public static void main(String[] args) {
        /*Task 1 Write a program that creates an array of integers with a
        length of 3. Assign the values 1, 2, and 3 to the indexes.
        Print out each array element.*/

        {
            int[] arr = new int[3];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }
            System.out.println(Arrays.toString(arr));
        }

        /*Task 2: Write a program that returns the middle element in an array.
        Give the following values to the integer array: {13, 5, 7, 68, 2}
        and produce the following output: 7*/
        {
            int [] arr = {13,5,7,68,2};
            int middle = Math.round(arr.length /2);
            System.out.println(arr[middle]);

        }

        /*
        Task 3: Write a program that creates an array of String type and initializes
        it with the strings “red,” “green,” “blue,” and “yellow.” Print out the array
        length. Make a copy using the clone( ) method. Use the Arrays.toString( )
        method on the new array to verify that the original array was copied.
        */
        {
            String[] colors = {"red", "green","blue" ,"yellow"};
            String [] newColorsArr = colors.clone();
            System.out.println("colors length = "+colors.length);
            System.out.println(Arrays.toString(newColorsArr));
        }

        /* Task 4: Write a program that creates an integer array with 5 elements
        (i.e., numbers). The numbers can be any integers.  Print out the value at
        the first index and the last index using length - 1 as the index. Now try
        printing the value at index = length (e.g., myArray[myArray.length] ).
        Notice the type of exception which is produced. Now try to assign a value to
        the array index 5. You should get the same type of exception.
         */
        {
            int [] arr = {1,2,3,4,5};
            System.out.println("First element is "+arr[0] + " last element is "+ arr[arr.length-1]);
//            System.out.println(arr[arr.length]);
//            arr[arr.length] = 6;
            System.out.println(Arrays.toString(arr));
        }

        /*
        Task 5: Write a program where you create an integer array with a length of 5.
        Loop through the array and assign the value of the loop control variable
        (e.g., i) to the corresponding index in the array.*/
        {
            int[] arr = new int[5];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }
            System.out.println(Arrays.toString(arr));
        }

        /*
        Task 6: Write a program where you create an integer array of 5 numbers.
        Loop through the array and assign the value of the loop control variable
        multiplied by 2 to the corresponding index in the array.
        */
        {
            int[] arr = new int[5];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i * 2;
            }
            System.out.println(Arrays.toString(arr));
        }

        /*
        Task 7: Write a program where you create an array of 5 elements. Loop through
        the array and print the value of each element, except for the middle (index 2)
        element.
        */
        {
            int[] arr = {1,2,3,4,5};
            int middleIndex = Math.round(arr.length / 2);
            for (int i = 0; i < arr.length; i++) {
                if (middleIndex != i) {
                    System.out.println(arr[i]);
                }

            }
        }
        /*
        Task 8: Write a program that creates a String array of 5 elements and
        swaps the first element with the middle element without creating a new
        array.
        */
        {
            String[] colors = {"red", "green","blue" ,"yellow","black"};
            int middleIndex = Math.round(colors.length /2);
            colors[0] = colors[middleIndex];
            System.out.println(Arrays.toString(colors));
        }

        /*
        Task 9:
            Write a program to sort the following int array in ascending order:
            {4, 2, 9, 13, 1, 0}. Print the array in ascending order, and print the
            smallest and the largest element of the array. The output will look like
            the following:
            Array in ascending order: 0, 1, 2, 4, 9, 13
            The smallest number is 0
            The biggest number is 13
        */
        {
            int [] arr = {4, 2, 9, 13, 1, 0};
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println("The smallest number is :"+arr[0]);
            System.out.println("The biggest number is :"+arr[arr.length-1]);
        }

        /*
        Task 10: Create an array that includes an integer, 3 strings, and
        1 double. Print the array.
        */
        {
            String [] strArr = {"3","white","black","blue","0.01"};
            for(int i = 0; i < strArr.length; i++){
                System.out.println(strArr[i]);
            }
        }

        /*
        Task 11: Write some Java code that asks the user how many favorite things
        they have. Based on their answer, you should create a String array of the
        correct size. Then ask the user to enter the things and store them in the
        array you created. Finally, print out the contents of the array.
        */
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number of favorite things you like: ");
            int len = sc.nextInt();
            sc.nextLine();
            String [] favoriteThings = new String[len];
            for(int i = 0; i < len; i++){
                String input = sc.nextLine();
                favoriteThings[i] = input;
            }
            System.out.println(Arrays.toString(favoriteThings));
        }









    }
}
