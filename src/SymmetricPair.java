import java.util.*;

/*Given a list of number pairs; if pair(i,j) exists, and pair(j,i) exists, report all such
pairs. For example, in {{1,3},{2,6},{3,5},{7,4},{5,3},{8,7}}, we see that {3,5} and
{5,3} are present. Report this pair when you encounter {5,3}. We call such pairs
‘symmetric pairs’. So, give an efficient algorithm for finding all such pairs */
public class SymmetricPair {
    public static void main(String[] args){
        int[][] inputPairs = {{1, 3}, {2, 6}, {3, 5}, {7, 4}, {5, 3}, {8, 7}};
        List<int[]> symmetricPairs = findSymmetricPairs(inputPairs);

        for (int[] pair : symmetricPairs) {
            System.out.println(Arrays.toString(pair));

    }
}

    private static List<int[]> findSymmetricPairs(int[][] inputPairs) {
        Map<Integer,Integer> pairMap=new HashMap<>();
        List<int[]> pairList=new ArrayList<>();
        for(int[] pair:inputPairs){
            int i=pair[0];
            int j=pair[1];
            if(pairMap.containsKey(j) && pairMap.get(j)==i){
                pairList.add(pair);
            }
            pairMap.put(i,j);


        }
     return pairList;
    }
    }
