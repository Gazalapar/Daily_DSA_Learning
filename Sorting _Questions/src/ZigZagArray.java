/* Question: Given an array of elements convert it into an array such that A < B > C < D > E< F and so on.*/

import java.util.ArrayList;
import java.util.Arrays;

public class ZigZagArray {
    public static void main(String[] args) {
        int[] arr = {0, -6, 9, 13, 10, -1, 8, 12, 54, 14, -5};
        /* In this method  we sort the array then swap the odd indexed element with the next even indexed element.
        In this way the previous element will be less than the current element and next element will be less than the current element
          i.e A<B>C<D>E<F  time complexity:O(nlogn)*/
        usingSorting(arr);


        /*Here we check if even indexed element is less than the odd indexed element  T.C:O(n) */
       // usingEvenAndOddConcept(arr);
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }

    private static void usingSorting(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=1;i<n;i+=2){
            if(i+1<n)
            swap(arr,i,i+1);
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    private static void usingEvenAndOddConcept(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(i%2==0 && arr[i]>arr[i+1])swap(arr,i,i+1);
            else if(i%2==1 && arr[i]<arr[i+1])swap(arr,i,i+1);
        }
    }
}
