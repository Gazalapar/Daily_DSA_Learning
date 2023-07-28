import  java.util.*;
 public class RemoveDupSortedArray{
   public static void main(String[] args){
     int [] arr={1,2,2,2,3,3};
    RemoveDupSortedArray rds=new RemoveDupSortedArray();
    int k=rds.bruteForceApproach(arr,arr.length);
   int r=rds.optimalApproach(arr,arr.length);
   System.out.println("the length after removing duplicates using bruteforce approach "+ k);
  System.out.println("the length  after removing duplicates using optimal in place approach " + r);
 }

//Time complexity:O(n) space complexity:O(n)

 public int bruteForceApproach(int[] arr,int n){
    Set<Integer> set=new HashSet<>();
    for(int i=0;i<n;i++){
     set.add(arr[i]);
    }
    int k=set.size();
    return k;

}

//time complexity:O(n) space complexity:O(1)
public int optimalApproach(int[] arr,int n){
     int i=0;
     for(int j=1;j<n;j++){
      if(arr[i]!=arr[j]){
      i++;
    arr[i]=arr[j];
}
}
return i+1;
}
  }
