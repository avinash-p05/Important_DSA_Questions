package tcs;
import java.util.*;

public class SubSetOf {
    public static void main(String[] args){
        int[] a = {1,1,2,3,4,5,6};
        int[] b = {1,2,4};
        Set<Integer> set = new HashSet<>();
        for(int j:b)
            set.add(j);
        for(int i=0;i<a.length;i++){
            if(set.contains(a[i])) {
                set.remove(a[i]);
            }
        }
        if(set.size()==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
