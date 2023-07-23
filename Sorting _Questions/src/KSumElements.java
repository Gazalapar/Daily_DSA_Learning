/* Let A and B be two arrays of n elements each. Given a number K, give an
O(nlogn) time algorithm for determining whether there exists a ∈ A and b ∈ B such that a
+ b = K.
*/

public class KSumElements {
    public static void main(String[] args) {
        int[] A={3,5,1,2};
        int[] B={5,2,3,7};
        int k=6;
         quicksort(A,0,A.length-1);
         for(int i=0;i<B.length;i++){
             int c=k-B[i];
             if(binarySeaarch(A,c))
                 System.out.println("yes,the pair exits");
             else
                 System.out.println("No,such pair does not exit");
         }


    }

    private static boolean binarySeaarch(int[] a, int c) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == c) {
                return true;
            } else if (a[mid] < c) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;


    }

    public static void quicksort(int[] A,int low,int high){
        if(low>=high) return;
        int pivot=partition(A,low,high);
        quicksort(A,low,pivot-1);
        quicksort(A,pivot+1,high);
   }
   public static int partition(int [] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(low<high){
            while(arr[i]<=pivot && i<high) i++;
            while(arr[j]>pivot && j>low)j--;
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
   }
}
