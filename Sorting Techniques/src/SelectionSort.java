public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={13,2,7,9,34,23};
        sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void sort(int[] arr){
        int n=arr.length;
        int min=0;
        int j=0;
        for(int i=0;i<=n-2;i++){
            min=i;
            for(j=i;j<=n-1;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}
