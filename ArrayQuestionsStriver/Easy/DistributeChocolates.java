/*Question:11  Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. 
Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum. 
*/

import java.util.*;

public class DistributeChocolates  {
    public static void main(String[] args)
    {
        int arr[] = { 12, 4,  7,  9,  2,  23, 25, 41, 30,  40, 28, 42, 30, 44, 48, 43, 50 };
         int m = 7; // Number of students

        int n = arr.length;
        System.out.println("Minimum difference is " + findMinDiff(arr, n, m));
    }
  //Time Complexity: O(N*log(N))
  // Space Complexity: O(1)

    static int findMinDiff(int arr[], int n, int m)
    {
		// if there are no chocolates or
		// number of students is 0
		if (m == 0 || n == 0)
			return 0;

		// Sort the given packets
		Arrays.sort(arr);

		// Number of students cannot be
		// more than number of packets
		if (n < m)
			return -1;
		int min_diff = Integer.MAX_VALUE;

		for (int i = 0; i + m - 1 < n; i++) {
			int diff = arr[i + m - 1] - arr[i];
			if (diff < min_diff)
				min_diff = diff;
		}
		return min_diff;
	}


}


