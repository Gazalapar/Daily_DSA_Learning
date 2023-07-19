public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr={13,56,23,1,2,19};
        insertionSort(arr,1,arr.length);
        for (int i:arr){
            System.out.print(i+" ");
        }



    }
    public static void insertionSort(int[] arr,int index,int n){
        if(index==n)return;
        int j=index;
        while(j>0 && arr[j-1]>arr[j]){
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
        }
        insertionSort(arr,index+1,n);
    }
}
