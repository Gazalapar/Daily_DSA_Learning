//question:6 Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day.

/*You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/

import java.lang.Math;
public class BuyAndSellStock{

 public static void main(String[] args){
  int[] prices={7,1,5,3,6,4};
  int n=prices.length;
 int maxProfit=bruteForceApproach(prices,n);
 System.out.println("maxProfit using bruteForceApproach is "+maxProfit);
maxProfit=optimalApproach(prices,n);
 System.out.println("maxProfit using OptimalApproach is "+maxProfit);


}

//Time complexity:O(n^2)
public static int bruteForceApproach(int[] prices,int n){

 int maxPro = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (prices[j] > prices[i]) {
                    maxPro = Math.max(prices[j] - prices[i], maxPro);
                }
            }
        }
        return maxPro;
}

//TimeComplexity:O(n)
public static int optimalApproach(int[] prices,int n){
     int maxPro = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i <n; i++) {
        minPrice = Math.min(minPrice, prices[i]);
        maxPro = Math.max(maxPro, prices[i] - minPrice);
    }
    return maxPro;
    
}
}
