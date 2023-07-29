//Question:5  Given an array of N integers, left rotate the array by one place.
public class LeftRotateByOne{
   public static void main(String[] args){
   int [] arr={1,2,3,4,5};
  LeftRotateByOne lrbo=new  LeftRotateByOne();
  lrbo.bruteForceApproach(arr,arr.length);
 lrbo.optimalApproach(arr,arr.length);
   

}
public void bruteForceApproach(int [] arr,int n){
   int [] temp=new int [n];
    
    for(int i=1;i<n;i++){
     temp[i-1]=arr[i];
   }
    temp[n-1]=arr[0];
  System.out.println("Using bruteForceApproach ");
  for(int i:temp){
  System.out.print(i +" ");
  }
 
System.out.println();
}

public void optimalApproach(int [] arr,int n){
   int temp=arr[0];
    for(int i=1;i<n;i++){
     arr[i-1]=arr[i];
  
}
arr[n-1]=temp;
System.out.println("using optimal approach");
 for(int i: arr){
   System.out.print(i+ " ");
  }
}
}
