import java.util.HashMap;
import java.util.Map;

/*
 Given m sets of integers that have n elements in them, provide an algorithm to
find an element which appeared in the maximum number of sets?
Suppose we have three sets (m = 3), each containing four elements (n = 4):

Set 1: [1, 2, 3, 4]
Set 2: [2, 4, 5, 6]
Set 3: [1, 2, 4, 6]
*/
public class MaximumOccuranceInSet {
    public static void main(String[] args) {
        int[][] sets = {{1, 2, 3, 4}, {2, 4, 5, 6}, {1, 2, 3, 6}};
        int res = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int[] set : sets) {
            for (int num : set) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }
        int count = -1;
        int maxcount = -1;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > count) {
                count = entry.getValue();
                maxcount = entry.getKey();
            }
        }
        System.out.println(maxcount);
    }
}
