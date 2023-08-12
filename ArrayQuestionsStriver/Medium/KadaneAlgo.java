//Question:4 Find the maximum subarray sum in an array 
//brute force and better solution already done before


public class KadaneAlgo{
  public static void main(String[] args){
  long [] arr={-2,1,-3,4,-1,2,1,-5,4};
   long  n=arr.length;
   long maxSum= kadaneAlgo(arr,n);
  System.out.println("The max subarray sum is: "+ maxSum);


}

//Time Complexity:O(n)
//space complexity:O(1)
public static long kadaneAlgo(long[] arr,long n){
 long sum=0;
long maxSum=Long.MIN_VALUE;
for(int i=0;i<n;i++){
sum+=arr[i];
if(sum>maxSum)maxSum=sum;
 if(sum<0)sum=0;

}

return maxSum;

}


}
