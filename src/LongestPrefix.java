//•	Write a function to find the longest common prefix string amongst an array of strings.
//o Input: strs = ["flower","flow","flight"] o Output: "fl"
import java.util.Arrays;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        StringBuffer sb = new StringBuffer();
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        int first = strs[0].length();
        int last = strs[strs.length-1].length();
        for(int i=0;i<Math.min(first,last);i++){
            if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i))
                break;
            sb.append(strs[0].charAt(i));
        }
        System.out.println(sb);
    }
}
