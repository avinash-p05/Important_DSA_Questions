//•	Given a string, find the length of the longest substring without repeating characters.
//o Example: For “ABDEFGABEF”, the longest substring are “BDEFGA” and “DEFGAB”, with length 6.

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "ABDEFGABEF";
        int max=0;
        int idx;
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length();i++){
            idx = sb.indexOf(String.valueOf(str.charAt(i)));
            if(idx!=-1){
                max = Math.max(max,sb.length());
                sb.delete(0,idx+1);
            }
            sb.append(str.charAt(i));
        }
        System.out.println(max);
    }
}
