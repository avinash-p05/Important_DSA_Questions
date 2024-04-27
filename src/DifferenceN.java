import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//•	Given an unsorted array and a number n, find if there exists a pair of elements in the array whose difference is n.
//o Input: arr[] = {5, 20, 3, 2, 50, 80}, n = 78 o Output: Pair Found: (2, 80)
public class DifferenceN {
    public static void main(String[] args) {
        int arr[] = {5, 20, 3, 2, 50, 80};
        int n = 78;
        Set<Integer> set = new HashSet<>();
        for(int i:arr){
            if(set.contains(n-i) || set.contains(i-n)){
                System.out.println("Pair Found - "+i+" "+(i-n));
            }
            else
                set.add(i);
        }
    }
}
