import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReturnUniqueLen {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3,4,4,5};
        System.out.println(Arrays.toString(arr));
        int k = unique(arr);
        String str = Arrays.toString(arr);
        System.out.println(str.subSequence(0,(k-1)*4));
        System.out.println("While whole array is - "+Arrays.toString(arr));

    }

    private static int unique(int[] arr) {

        int i=0;
        Set<Integer> set = new HashSet<>();

        while (i!=arr.length){
            if(set.contains(arr[i])){
                int j=i+1;
                while(j!= arr.length){
                    if(!set.contains(arr[j])){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                    j++;
                }
                if(j==arr.length)
                    return i;
            }
            set.add(arr[i]);
            i++;
        }
        return arr.length;
    }
}
