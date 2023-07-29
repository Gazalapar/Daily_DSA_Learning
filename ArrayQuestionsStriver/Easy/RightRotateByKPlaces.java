import java.util.Scanner;
//Question :6 Right rotate the array by K places
public class RightRotateByKPlaces{
 public static void main(String[] args){
   int[] arr={1,2,3,4,5,6,7};
   Scanner sc=new Scanner(System.in);
   System.out.println("please provide the value  to how many places to rotate");
   int k=sc.nextInt();
   RightRotateByKPlaces rrbkp=new RightRotateByKPlaces();
   rrbkp.bruteForceApproach(arr,k,arr.length);
  rrbkp.optimalApproach(arr,k,arr.length);
  

} 

//Time complexity:O(k)+O(n-k)+O(k)=O(n+k)    space complexity:O(k)
 public void  bruteForceApproach(int[]  arr,int k,int n){
   if (n == 0)
      return;
    k = k % n;
    if (k > n)
      return;
    int[] temp = new int[k];
    for (int i = n - k; i < n; i++) {
      temp[i - n + k] = arr[i];
    }
    for (int i = n - k - 1; i >= 0; i--) {
      arr[i + k] = arr[i];
    }
    for (int i = 0; i < k; i++) {
      arr[i] = temp[i];
    }
    System.out.println("After Rotating the elements to right using bruteForce approach ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");

}
System.out.println();  
}

//Time complexity :O(k)+(n-k)+O(n)=O(2n)  space complexity:O(1)
public void optimalApproach(int[] arr,int k,int n){
  RightRotateByKPlaces rr=new RightRotateByKPlaces();

  // Reverse first n-k elements
 rr. Reverse(arr, 0, n - k - 1);
  // Reverse last k elements
 rr. Reverse(arr, n - k, n - 1);
  // Reverse whole array
 rr. Reverse(arr, 0, n - 1);
  System.out.print("After Rotating the k elements to right using optimal approach ");
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
}

public void Reverse(int[] arr, int start, int end) {
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
}
}
