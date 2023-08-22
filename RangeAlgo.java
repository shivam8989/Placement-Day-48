package Arrays;
import java.util.*;
public class RangeAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Enter the elements in array");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        for(int i = 0; i<size; i++){
            max = Math.max(arr[i],max);
            min = Math.min(arr[i],min);
        }
        System.out.println("The greatest element in array is :- "+ max);
        System.out.println("The smallest element in array is :- "+ min);

    }
}
