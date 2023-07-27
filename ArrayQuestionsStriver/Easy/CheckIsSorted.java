
//Question3: Check if array is sorted
  public class CheckIsSorted{
       public static void main(String[] args){
          int[] arr={1,2,3,4,5};
          int[]  nums={1,2,4,3,5};
          CheckIsSorted cis=new CheckIsSorted();
         boolean isSorted=cis.bruteForceApproach(arr,arr.length);
        boolean is_Sorted=cis.optimalApproach(nums,nums.length);
       System.out.println("isSorted  "+ isSorted);
      System.out.println("isSorted "+ is_Sorted);
  }
  // Time complexity:O(n^2) as we take two for loops for traversal
  public boolean  bruteForceApproach(int []  arr,int n){
      for(int i=0;i<n;i++){
       for(int j=i+1;j<n;j++){
        if(arr[j]<arr[i])return false; 
    }
}
   return true;
    }


//time complexity :O(n) effective solution ,single traversal 
//logic:as we know in an sorted array the  preceeding  element is always less than or equal to the successor element
public boolean optimalApproach(int[] nums,int n){
     for(int i=1;i<n;i++){
         if(nums[i]<nums[i-1])return false;
     }
  return true;
}
}

  

