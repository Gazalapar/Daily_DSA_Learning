//Question:6 Move all the zeroes to the end
  import java.util.*;
public class MoveZerosToEnd{
  public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n =arr.length;
      MoveZerosToEnd mzte=new MoveZerosToEnd();
     System.out.println("using bruteForceApproach");
      mzte.bruteForceApproach(arr,n);
    System.out.println("using optimal approach");
      mzte.optimalApproach(arr,n);

    }

//time complexity:O(n)+O(n-x)+O(x) =O(2n)   where x=no.of zeros 
//  space complexity:O(n-x) but it may be possible that the array do not have any zero so in that case O(n)

public  void bruteForceApproach(int [] arr,int n){
      //temporary array
        ArrayList<Integer> temp = new ArrayList<>();
        //copy non-zero elements
        //from original -> temp array:
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                temp.add(arr[i]);
        }

        // number of non-zero elements.
        int nz = temp.size();

        //copy elements from temp
        //fill first nz fields of
        //original array:
        for (int i = 0; i < nz; i++) {
            arr[i] = temp.get(i);
        }

        //fill rest of the cells with 0:
        for (int i = nz; i < n; i++) {
            arr[i] = 0;
        }
        for(int  a:arr){
        System.out.print(a+" ");

    }
System.out.println();
}

//time complexity:O(n) space complexit:O(1)
public void optimalApproach(int [] arr,int n){
        int i = 0; 
        for (int a:arr){
            if(a != 0){
                arr[i] = a;
                i++;
            }
        }
        while(i<n){
            arr[i] = 0;
            i++;
        }

   for(int a:arr){
    System.out.print(a+" ");
   }
   System.out.println();
}


}

