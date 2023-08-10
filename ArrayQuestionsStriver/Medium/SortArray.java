//Question2:Sort an array of 0s, 1s and 2s
//Problem Statement: Given an array consisting of only 0s, 1s, and 2s. Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)
public class SortArray{
  public static void main(String[] args){
    int[] arr={2,1,2,0,0,1,2};
    int n=arr.length;
   //brute force approach sort the array using any sorting algorithm like merge sort
    betterApproach(arr,n);
   System.out.println("after applying better approach");
  for(int i:arr){
  System.out.print(i +" ");
}
System.out.println();
optimalApproach(arr,n);
 System.out.println("after applying optimal  approach");
  for(int i:arr){
  System.out.print(i +"");
}

}




public static void betterApproach(int[] arr,int n){
  int count0=0,count1=0,count2=0;
  for(int i=0;i<n;i++){
   if(arr[i]==0)count0++;
   else if(arr[i]==1)count1++;
  else count2++;

}
for(int i=0;i<count0;i++) arr[i]=0;
for(int i=count0;i<count0+count1;i++)arr[i]=1;
for(int i=count0+count1;i<count0+count1+count2;i++) arr[i]=2;

}

public static void optimalApproach(int [] arr,int n){
  int  mid=0,low=0,high=n-1;
   while(mid<=high){
    if(arr[mid]==0){
      swap(arr,low,mid);
        low++;
        mid++;

   }
   else if(arr[mid]==1) mid++;
   else{
    swap(arr,mid,high);
    high--;
}

}
}
public static void swap(int[] arr,int  i,int j){
 int temp=arr[i];
 arr[i]=arr[j];
 arr[j]=temp;



}

}



