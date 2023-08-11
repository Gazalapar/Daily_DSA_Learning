//Question3:Problem Statement: Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array. You may consider that such an element always exists in the array.
import java.util.Map;
import java.util.HashMap;
public class MajorityElement{
 public static void main(String[] args){
   int [] arr={2,2,1,1,1,2,2};
   int n=arr.length;
   int majorityElement= bruteForceApproach(arr,n);
   System.out.println("majority element using bruteForce Approach "+majorityElement); 
   majorityElement=  betterApproach(arr,n);
   System.out.println("majority element using bettere Approach "+majorityElement);     
   majorityElement =  optimalApproach(arr,n);
   System.out.println("majority element using optimal  Approach "+majorityElement); 


}

//Time complexity:O(n^2)
//Space complexity:O(1)
public static int bruteForceApproach(int[] arr,int n){
  
  for(int i=0;i<n;i++){
  int count=0;    
  for(int j=0;j<n;j++){
    if(arr[i]==arr[j])count++;
}

if(count>n/2)return arr[i];
}

return -1;

}

//Time Complexity:O(n+m) where m is the search traversal in worst case it can be O(n) so  O(2n)
//space complexity:O(n)

public static int betterApproach(int [] arr,int n){

  HashMap<Integer,Integer> map=new HashMap<>();
  for(int i=0;i<n;i++)map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
  for(Map.Entry<Integer,Integer> iter:map.entrySet()){
   if(iter.getValue()>n/2) return iter.getKey();

}

return -1;

}
//time complexity:O(n)
//space complexity:O(1)
public static int optimalApproach(int[] arr,int n){
 int count=0;
 int ele=0;
 for(int i=0;i<n;i++){
   if(count==0){
    count++;
   ele=arr[i];

}
 else if(arr[i]==ele)count++;
else count--;

}
  return ele;

}


}
