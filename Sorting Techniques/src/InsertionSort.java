public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={2,8,5,3,0,4,1};
        sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
}
