package module303;

import java.util.Arrays;

public class InitializingArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int size = arr.length -1;
        int deleteNum = 5;
        int [] arr2= new int[size];
        for(int i = 0; i < size; i++){
            if(arr[i] == deleteNum){
                arr2[i] = arr[i+1];
                System.out.println(arr2[i] + " = Arr2 i " + i + " arr i "+ arr[i]);

            }
           else{
                arr2[i] = arr[i];
                System.out.println(arr2[i]);
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
