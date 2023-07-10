import java.util.LinkedHashSet;

public class RemoveDuplicatesUsingHashing {
    public static void main(String[] args) {
        String s="adbcdbc";
        String result = removeDuplicates(s.toCharArray());
        System.out.println(result);
    }
    public static String removeDuplicates(char[] c){
        //LinkedHashSet add the unique elements only
        LinkedHashSet<Character> l=new LinkedHashSet<>();
        for(int i=0;i<c.length;i++){
            l.add(c[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch : l) {
            sb.append(ch);
        }

        return sb.toString();
    }
}

