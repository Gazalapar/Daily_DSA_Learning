//QUESTION:9 count the maximum number of consecutive ones
import java.lang.Math.*;
public  class  MaxConsecutiveOnes{
  public static void main(String[] args){
   int[] arr={0,1,1,4,5,1,1,1,0};
   int maxCount=maxConsecutiveOnes(arr,arr.length);
    System.out.println(maxCount);



}
public static int maxConsecutiveOnes(int [] arr,int n){
int count=0;
int maxCount=0;
  for(int i=0;i<n;i++){
    if(arr[i]==1)count++;
    else count=0;
   maxCount=Math.max(count,maxCount);
   

}
return maxCount;

}
}
