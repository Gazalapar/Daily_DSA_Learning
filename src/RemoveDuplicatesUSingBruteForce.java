//given a array of characters ,give an algorithm to remove duplicates
//given a string remove duplicates


public class RemoveDuplicatesUSingBruteForce {
    public static String removeDuplicates(char[] input) {
        int length = input.length;
        //to keep track upto what index the characters are not repeated
        int tail = 0;

        // Compare each element with all subsequent elements
        for (int i = 0; i < length; i++) {
            int j;

            for (j = 0; j < i; j++) {
                //Check whether input[i] is present before or not
                if (input[i] == input[j]) {
                    break;
                }
            }
            // If no duplicate is found, add the element to the tail
            if (j == tail) {
                input[tail] = input[i];
                tail++;
            }
        }

        // Create a new array with the non-duplicate elements
        char[] result = new char[tail];
        System.arraycopy(input, 0, result, 0, tail);

        return new String(result);

    }

    public static void main(String[] args) {
        String s="adbcdbc";
        String result = removeDuplicates(s.toCharArray());
        System.out.println(result);


    }
}
