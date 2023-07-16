import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

/*Leetcode (https://leetcode.com/problems/remove-duplicate-letters/description/)
* 316. Remove Duplicate Letters
 Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is
the smallest in lexicographical order
 among all possible results.
Example 1:

Input: s = "bcabc"
Output: "abc"
Example 2:
Input: s = "cbacdcbc"
Output: "acdb"*/
public class RemoveDuplicatesLexicographically {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of testcase");
        int testcases =sc.nextInt();
        System.out.println("enter the string:");
        sc.nextLine(); // Consume the remaining newline character
        for(int i=0;i<testcases;i++){

            String s=sc.nextLine().toLowerCase();
            String res=removeDuplicatesLexi(s);
            System.out.println(res);
        }



    }

    private static String removeDuplicatesLexi(String s) {
        //to count the frequency of occurance of characters
        char [] count=new char[26];
        //to keep track of the visited charcters in the stack
        boolean [] visited=new boolean[26];

        Stack<Character> stack=new Stack<>();
        // for counting the frequency of each character
        for(char ch:s.toCharArray()){
            count[ch-'a']++;
        }
        //process each character of string
        for(char ch:s.toCharArray()){
            count[ch-'a']--;//decrement the frequency of the current character that we are going to push into the stack
            //skip the character if already visited
            if(visited[ch-'a']){
                continue;
            }
            //we will pop only that character whose frequency is greater than or equal to 1 after decrement also because that will have the future occurances
            while(!stack.isEmpty()&& stack.peek()>ch &&count[stack.peek()-'a']>0){
                visited[stack.peek()-'a']=false;
                stack.pop();
            }
            //push the current character and mark it as visited
            stack.push(ch);
            visited[stack.peek()-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }
        return sb.toString();

    }
}
