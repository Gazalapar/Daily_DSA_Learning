//Question:8 Find missing number  in an array which comprises of elements from 1toN
 public class MissingNumber{
 public static void main(String[] args){
   int [] arr={1,2,4,5};
   int n=5;
   MissingNumber mn=new MissingNumber();
   int missing1=mn.bruteForceApproach(arr,n);
   System.out.println("Missing number using bruteForceApproach "+missing1 );
   int missing2=mn.betterApproach(arr,n);
   System.out.println("Missing number using betterApproach " + missing2);
   int missing3=mn.optimalApproach(arr,n);
  System.out.println("Missing number using optimalApproach "+missing3);
}  

//Using linear search as numbers are from 1toN
//Time complexity:O(n^2)
//space complexity:O(1)
  public int bruteForceApproach(int [] arr,int n){
     // Outer loop that runs from 1 to n:
        for (int i = 1; i <= n; i++) {

            // flag variable to check
            //if an element exists
            int flag = 0;

            //Search the element using linear search:
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {

                    // i is present in the array:
                    flag = 1;
                    break;
                }
            }

            // check if the element is missing
            //i.e flag == 0:

            if (flag == 0) return i;
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
}

//using hashing keeping the occurence of each element from 1toN 
//Time complexity:O(2N)
//space complexity:O(N)
public int betterApproach(int [] arr,int n){
   int [] hash=new int[n+1];
  

   for(int i=0;i<n-1;i++){
    hash[arr[i]]++;
}
  for(int i=1;i<=n;i++){
   if(hash[i]==0)return i;

}
return -1;

}
//usinh Xor   
//a^a=0 ,0^a=a
//time complexity=O(n)
//space complexity:O(1)
public int optimalApproach(int [] arr,int n){

int xor1 = 0, xor2 = 0;

  for (int i = 0; i < n - 1; i++) {
         xor2 = xor2 ^ arr[i]; // XOR of array elements
         xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
     }

      xor1 = xor1 ^ n; //XOR up to [1...N]

      return (xor1 ^ xor2); // the missing number

}
}
