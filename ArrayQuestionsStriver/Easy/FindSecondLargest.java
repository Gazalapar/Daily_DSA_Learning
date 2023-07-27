//Question2 :Find the second largest in the array
import java.util.Arrays;

public class FindSecondLargest{
    public static void main(String[] args){
     int[] arr={2,8,3,4,1,5};
    FindSecondLargest  fsl=new FindSecondLargest();

   int secondLargest= fsl. bruteForceApproach(arr,arr.length);

  int second__Largest = fsl. betterApproach(arr,arr.length);

 int second_Largest =fsl. optimalApproach(arr,arr.length);
  System.out.println("the SecondLargest element  using BruteForceApproach "+ secondLargest);
  System.out.println("the SecondLargest element using BetterApproach " + second__Largest);
  System.out.println("the secondLargest element using OptimalApproach "+ second_Largest);
}
//Time complexity :(nlogn) 
public int bruteForceApproach(int []arr,int n){
   Arrays.sort(arr);
   return arr[n-2];
}


//Time complexity:O(2n) as no. of passes are two
public int  betterApproach(int arr [] ,int n){
   int large=Integer.MIN_VALUE;
   int secondLarge=Integer.MIN_VALUE;
  for(int i=0;i<n;i++)
   {
     if(arr[i]>large)large=arr[i];
   }
   for(int i=0;i<n;i++){
   if(arr[i]>secondLarge && arr[i]!=large)secondLarge=arr[i];
 }
return secondLarge;
}



//time complexity:O(n) as in only one pass we find the secondLargest
public int optimalApproach(int arr[],int n){
   int large=Integer.MIN_VALUE;
   int secondLarge=Integer.MIN_VALUE;
   for(int i=0;i<n;i++){
      if(arr[i]>large)
     {
         secondLarge=large;
         large=arr[i];
     }
   else if(arr[i]>secondLarge && arr[i]!=large){
 
    secondLarge=arr[i];
  }

    }
   return secondLarge;
}

}
  



