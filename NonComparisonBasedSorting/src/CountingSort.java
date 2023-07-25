import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] A={2,5,3,0,2,3,0,3};
        int n=A.length;
        //find min and max
        int min=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(A[i]>max) max=A[i];
            if(A[i]<min)min=A[i];
        }
        int[] count=new int[max+1];
        Arrays.fill(count,0);
        for(int i=0;i<n;i++){
            count[A[i]]+=1;
        }
        //perform cumulative sum
        for(int i=1;i<=max;i++){
            count[i]=count[i]+count[i-1];
        }
        //take an output array of size n
        int[] output=new int[n];
        for(int i=n-1;i>=0;i--){
            output[count[A[i]]-1]=A[i];
            count[A[i]]--;
        }
        for (int i:output){
            System.out.print(i+ " ");
        }

    }
}
