public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={23,5,89,33,1,4};
        sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void sort(int[] arr){
        int n=arr.length;
        for(int i=n-1;i>=1;i--){
            int didSwap=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    didSwap=1;
                }
            }
            if(didSwap==0)
                break;
        }
    }
}
