public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[ ] arr={3,9,2,1,5,10};
        int n=arr.length;
        bubbleSort(arr,n);
        for(int i:arr){
            System.out.print(i+ " ");
        }
    }
    public static void bubbleSort(int [] arr,int n){
        if(n==1) return;
        int didSwap=0;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                int temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
                didSwap=1;
            }
        }
        if(didSwap==0)return;
        bubbleSort(arr,n-1);
    }
}
