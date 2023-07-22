/*   Question:Given an array A[0 ...n – 1], where each element of the array represents a vote in
the election. Assume that each vote is given as an integer representing the ID of the chosen
candidate. Give an algorithm for determining who wins the election.

*/
//This problem is nothing but finding the element which repeated the maximum number  of times.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WhoWinsElection {
    public static void main(String[] args){
        int[] votes = {3, 1, 3, 3, 2, 3, 3, 1, 3, 4, 3};
        int winner = findMajorityCandidate(votes);

            System.out.println("The winner of the election is candidate " + winner);

        }


   //approach 1: O(n^2)
  /*  private static int findMajorityCandidate(int[] votes) {
        int n=votes.length,counter,maxCount=0,winner=0;

        for(int i=0;i<n;i++){
             counter=0;

             for(int j=0;j<n;j++){
                 if(votes[i]==votes[j])counter++;
             }
             if(counter>maxCount){
                 maxCount=counter;
                 winner=votes[i];
             }

        }

        return winner;
    }*/
    //approach 2: Using Sorting O(nlogn)
  /*  private static int findMajorityCandidate(int[] votes){
        Arrays.sort(votes);
        int currentCounter = 1;
        int maxCounter = 1;
        int maxCandidate = votes[0];
        int n = votes.length;

        for (int i = 1; i < n; i++) {
            if (votes[i] == votes[i - 1]) {
                currentCounter++;
            } else {
                currentCounter = 1;
            }

            if (currentCounter > maxCounter) {
                maxCounter = currentCounter;
                maxCandidate = votes[i];
            }
        }


            return maxCandidate;
        }*/
    //Approach 3 using HashMap O(n)
    private  static int findMajorityCandidate(int[] votes){
        if (votes.length == 0) {
            return -1; // Return -1 if the array is empty
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element
        for (int vote : votes) {
            frequencyMap.put(vote, frequencyMap.getOrDefault(vote, 0) + 1);
        }

        int maxFrequency = 0;
        int candidateWithMaxFrequency = 0;

        // Find the element with the maximum frequency
        for (int candidate : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(candidate);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                candidateWithMaxFrequency = candidate;
            }
        }

        return candidateWithMaxFrequency;
    }
    }


