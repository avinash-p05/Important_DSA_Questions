
import java.util.Arrays;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        StringBuffer sb = new StringBuffer();
        Arrays.sort(strs);
        String f=strs[0];
        String l=strs[strs.length-1];

        for(int i=0;i< Math.min(f.length(),l.length());i++){
            if(f.charAt(i)!=l.charAt(i)){
                break;
            }
            sb.append(f.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
