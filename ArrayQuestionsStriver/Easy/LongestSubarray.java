//Question :10 Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
import java.lang.Math.*;
import java.util.Map;
import java.util.HashMap;
public class LongestSubarray{
 public static void main(String[] args){
   int[] arr={1,2,3,1,1,1,1,4,2,3};
   int n=arr.length;
  int k=3;
   int  len1=bruteForceApproach(arr,n,k);
   int len2=betterApproach(arr,n,k);
  int len3=optimalApproach(arr,n,k);
 System.out.println("The longest subarray length using bruteForceApproach "+ len1);
System.out.println("The longest subarray length using betterApproach "+ len2);
 System.out.println("The longest subarray length using optimalApproach "+len3);

}
//Time complexity:O(n^2) 
//Space complexity:O(1)
public static int bruteForceApproach(int[] arr,int n,int k){
   int len=0;
  for(int i=0;i<n;i++){
   int sum=0;
   for(int j=i;j<n;j++){
    sum+=arr[j];

   if(sum==k){
    len=Math.max(len,j-i+1);

}
}
}  
return  len;
}

//Using Hashing reverse mathematice prefix sum
//Time complexity:O(n)
//space complexity:O(n)
public static int betterApproach(int [] arr,int n,int k){
   Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += arr[i];

            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // calculate the sum of remaining part i.e. x-k:
            long rem = sum - k;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;

}
//Two pointers approach sliding the  window forward whenever the sum>k
//Time complexity:O(2*n)  The outer while loop i.e. the right pointer can move up to index n-1(the last index). Now, the inner while loop i.e.
// the left pointer can move up to the right pointer at most. So, every time the inner loop does not run for n times rather it can run for n times in total. So, the time complexity will be O(2*n) instead of O(n*n)
//Space complexity:O(1)
public static int optimalApproach(int [] arr,int n,int k){
   int left = 0, right = 0; // 2 pointers
        long sum = arr[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += arr[right];
        }

        return maxLen;

}
}
