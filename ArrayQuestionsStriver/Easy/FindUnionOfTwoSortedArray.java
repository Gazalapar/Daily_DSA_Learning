//Question : find union of the  two sorted array
 
import java.util.*;
public class FindUnionOfTwoSortedArray{
   public static void main(String[] args){
 int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int arr2[] = {2, 3, 4, 4, 5, 11, 12};
  int n=arr1.length;
   int m=arr2.length;
   FindUnionOfTwoSortedArray fu=new  FindUnionOfTwoSortedArray();
  ArrayList<Integer> Union = fu. bruteForceApproach(arr1, arr2, n, m);
  System.out.println("Union of arr1 and arr2 using brute force approach ");
  for (int val: Union){
    System.out.print(val+" ");
}
System.out.println();
  ArrayList<Integer> Union2 = fu.optimalApproach(arr1, arr2, n, m);
  System.out.println("Union of arr1 and arr2 using optimal approach ");
  for (int val: Union2){
    System.out.print(val+" ");
}
}
//Time complexity :O((n+m)log(n+m))  as  Treeset  takes O(log n) for insertion and for each insertion it runs n and m times
//space complexity:O(m+n)
 public ArrayList<Integer> bruteForceApproach(int [] arr1,int [] arr2,int n,int m){
    // Create a TreeSet to store unique elements from both arrays 
    //TreeSet automatically sorts the values
        Set<Integer> set = new TreeSet<>();

        // Add elements from the first array to the set
        for (int num : arr1) {
            set.add(num);
        }

        // Add elements from the second array to the set
        for (int num : arr2) {
            set.add(num);
        }

        // Convert the set to an array to get the union of the two arrays
        ArrayList<Integer> union = new ArrayList<>();
        
        for (int num : set) {
            union.add(num);
        }

        return union;


}

//Using Two pointer approach
// here time complexity :O(n+m) as i runs maxs n times and  j runs at max m times 
//space complexity:O(1)
public ArrayList<Integer> optimalApproach(int [] arr1,int [] arr2,int n,int m){
    int i = 0, j = 0; 
  ArrayList<Integer > Union=new ArrayList<>(); 
  while (i < n && j < m) {
    if (arr1[i] <= arr2[j]) 
    {
      if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
        Union.add(arr1[i]);
      i++;
    } else 
    {
      if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
        Union.add(arr2[j]);
      j++;
    }
  }
  while (i < n) 
  {
    if (Union.get(Union.size()-1) != arr1[i])
      Union.add(arr1[i]);
    i++;
  }
  while (j < m) 
  {
    if (Union.get(Union.size()-1) != arr2[j])
      Union.add(arr2[j]);
    j++;
  }
  return Union;   
}
}

