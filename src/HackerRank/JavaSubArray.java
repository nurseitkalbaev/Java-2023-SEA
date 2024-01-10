package HackerRank;

import java.util.Scanner;

public class JavaSubArray {
    public static void main(String[] args) {
        /*
        We define the following:
A subarray of an -element array is an array composed from a contiguous block of the original array's elements.
For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a
contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of  integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer, , denoting the length of array .
The second line contains  space-separated integers describing each respective element, , in array .

Constraints

Output Format

Print the number of subarrays of  having negative sums.

Sample Input

5
1 -2 4 -5 1
Sample Output

9
Explanation

There are nine negative subarrays of :

Thus, we print  on a new line.
        */
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt(); // example: 5
        sc.nextLine();
        String nums = sc.nextLine(); // example: 1 -2 4 -5 1
        String []strArr =nums.split(" ");
        int [] numsArr= new int [strArr.length];
        int negSum = 0;
        for(int i = 0; i < strArr.length; i++){
            numsArr[i] = Integer.parseInt(strArr[i]);
        }

        for(int i = 0; i < numsArr.length; i++){
            int sumOfsubStrings = 0;
            for(int j = i; j < numsArr.length; j++){
                sumOfsubStrings += numsArr[j];
                if(sumOfsubStrings < 0) negSum ++;
            }
        }


        System.out.println(negSum);



    }
}
