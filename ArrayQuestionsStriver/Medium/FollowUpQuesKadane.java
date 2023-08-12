//Question:5   There might be more than one subarray with the max sum .we need to print any of them



public class FollowUpQuesKadane{
 public static void main(String[] args){
  long [] arr={-2,-3,4,-1,-2,1,5,-3};
   long n=arr.length;
   maxSubarraySum(arr,n);



}
public static void maxSubarraySum(long[] arr,long n){
 long sum=0;
long maxSum=Long.MIN_VALUE;
int start=0;
int ansStart=-1, ansEnd=-1;
for(int i=0;i<n;i++){
  
   sum+=arr[i];
if(sum>maxSum){
  maxSum=sum;
   ansStart=start;
   ansEnd=i;


}
if(sum<0){
 sum=0;
 start=i;
}
}
System.out.print("The subarray is:[");
for(int i=ansStart;i<ansEnd;i++){
 System.out.print(arr[i]+",");
  
}
System.out.println( arr[ansEnd]+"]");

System.out.println("maxSum "+maxSum);
}
}
