import java.util.Arrays;

public class RemoveDuplicatesUsingSorting {
    public static void main(String[] args) {
        String s="adbcdbc";
        String result = removeDuplicates(s.toCharArray());
        System.out.println(result);
    }

    private static String removeDuplicates(char[] arr) {
        //sort the array the consecutive same characters can be compared easily and removed
        Arrays.sort(arr);
        //to keep track of the input string
        int index1=1;
        //to keep track of the output string
        int index2=1;
        while(index1<arr.length){
            if(arr[index1]!=arr[index1-1]){
                arr[index2]=arr[index1];
                index2++;
            }
            index1++;

        }
        String s=new String(arr);
        return s.substring(0,index2);
    }
}
