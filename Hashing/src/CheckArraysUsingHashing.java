import java.util.HashMap;
import java.util.Map;

public class CheckArraysUsingHashing {
    public static void main(String[] args) {
        long[]A={2,5,6,8,10,2,2};
      long[]  B={2,5,5,8,10,5,6};
        System.out.println(check(A, B));
    }
    public static boolean check(long[] A, long[] B) {
        if (A.length != B.length)
            return false;

        Map<Long, Long> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0L) + 1);
        }

        for (int i = 0; i < B.length; i++) {
            long count = map.getOrDefault(B[i], 0L);

            if (count == 0) {
                return false;
            }

            map.put(B[i], count - 1);

            if (count - 1 == 0) {
                map.remove(B[i]);
            }
        }

        return map.isEmpty();
    }

}
