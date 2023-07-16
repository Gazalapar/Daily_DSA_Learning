import java.util.HashSet;

public class TripletSumEqualToZero {
    public static void main(String[] args) {
        int[] arr={0,-1,2,3,1};
        boolean res=tripletZeroSum(arr);
        System.out.println(res);
    }

    private static boolean tripletZeroSum(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n-1;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<n;j++){
                sum=-arr[i]-arr[j];
                if(set.contains(sum))return true;
                set.add(arr[j]);
            }


        }
        return false;
    }
}
