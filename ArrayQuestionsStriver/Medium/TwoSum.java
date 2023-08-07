//Question:1 Problem Statement: Given an array of integers arr[] and an integer target.

/*1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.

2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.

Note: You are not allowed to use the same element twice. Example: If the target is equal to 6 and num[1] = 3, then nums[1] + nums[1] = target is not a solution.*/
 
import java.util.HashMap;
import java.util.Arrays;
public class TwoSum{
   public static void main(String[] args){

    int[] arr={2,6,5,8,11};
    int n=arr.length;
   int target=14;
   int[] ans=bruteForce(arr,n,target);
    System.out.println("indexes are:");
   System.out.println("using bruteforce approach " +ans[0]+","+ans[1]);
   ans=betterApproach(arr,n,target);
  System.out.println("using betterApproach " + ans[0]+ ","+ans[1]);
  boolean  isPresent=optimizedApproach(arr,n,target);
 System.out.println("using optimized approach for variant 1: "+ " isPresent-> "+ isPresent);
   

}

//Time complexity :O(N^2) 
//space complexity:O(1)
  public static  int[]  bruteForce(int[] arr,int n,int target){
    for(int i=0;i<n;i++){
         for(int j=i+1;j<n;j++){

             if(arr[i]+arr[j]==target){
                return new int[]{i,j};

          }

     }
   

  } 
return new int[]{-1,-1};

}

//using hashing
//Time complexity: O(N)
//Space complexity:O(1)
//This is the optimal approach for variant 2 in which indexes are asked
public static int[] betterApproach(int[] arr,int n,int target){
 HashMap<Integer,Integer>  map=new HashMap<>();
  for(int i=0;i<n;i++)
{

  int needed=target-arr[i];
   if(map.containsKey(needed)){
     return new int[]{map.get(target-arr[i]),i};

}
  map.put(arr[i],i);
}


return new int[]{-1,-1};

}


//using Two Pointers (greedy approach)  sorts the array then apply two pointers approach
//Time complexity:O(N*log(N))
//Space complexity:O(1)
//This is the optimal approach for variant 1 in which we have to return a boolean value 
//not an optimal approach for  variant 2 as we need indexes for which we will need another data structure to store values index wise and then sort them
public static boolean optimizedApproach(int[] arr,int n,int target){

   Arrays.sort(arr);
   int left=0;
   int right=n-1;
   while(left<right){
     if(arr[left]+arr[right]==target)  return true;
    else if(arr[left]+arr[right]<target) left++;
    else  right--;




}
 return false;

}


}
