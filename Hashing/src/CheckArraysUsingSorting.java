import java.util.Arrays;

/*Given two arrays of unordered numbers, check whether both arrays have the same
set of numbers?
input:A={2,5,6,8,10,2,2}
B={2,5,5,8,10,5,6}
output:false


*/
public class CheckArraysUsingSorting {
    public static void main(String[] args) {
       long A[] = {1,2,5,4,0};
      long  B[] = {2,4,5,0,1};
        System.out.println(check(A, B));
    }
    public static boolean check(long A[], long B[]) {
        if(A.length!=B.length){
            return false;
        }
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }



        return true;
    }
}

