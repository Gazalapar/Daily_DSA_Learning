//Question: Find the largest element among the array Elements
public class FindLargest{
     public static void main(String[] args){
         int [] arr={3,4,1,2,8};
         FindLargest fl=new FindLargest();
         int max= fl.findLargest(arr,arr.length);
          System.out.print("the largest element is "+ max);
        

}
 public int  findLargest(int[ ] arr,int n){
      int max=Integer.MIN_VALUE;
     for(int i=0;i<n;i++){
         if(arr[i]>max){
            max=arr[i];
         }
}
 return max;
}
}
