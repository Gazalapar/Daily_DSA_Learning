//Question :11  Given a binary array and an integer m, find the position of zeroes flipping which creates maximum number of consecutive 1’s in array.
 public class MaxConsecutiveOnesFlipZero{
  public static void main(String[] args){
    int arr[] = new int[]{1, 0, 0, 1, 1, 0, 1, 0, 1, 1};
          System.out.println("Indexes of zeroes to be flipped are ");
          findZeroes(arr, 2);  
  }
   
 public static void findZeroes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int zeroes = 0;
 
        while (end < nums.length) {
            if (nums[end] == 0) {
                zeroes++;
            }
            end++;
            if (zeroes > k) {
                if (nums[start] == 0) {
                    zeroes--;
                }
                start++;
            }
        }
       
          for(int i = start; i <= Math.min(nums.length - 1, end); i++){
              if(nums[i] == 0){
                  System.out.print(i + " ");
            }
        }
    }
}
