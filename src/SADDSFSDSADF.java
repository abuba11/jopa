import java.util.Scanner;
import java.util.Arrays;

public class SADDSFSDSADF {
    public static void main(String[] args){
        int [] arr = {45,3,9,8,7};
        System.out.println();

    }
    public static int[] sort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
