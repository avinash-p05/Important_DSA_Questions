import java.util.Arrays;

//•	Write a program to check if the array contains a duplicate i.e., any value appears at least twice in the array.
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] a = {5,3,4,2,6,1};
        Arrays.sort(a);
        int n = a.length;

        for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1]){
                System.out.println("Contains duplicate");
                break;
            }
        }

//        int[] freq = new int[n+1];
//        for(int i : a)
//            freq[i]++;
//        for(int i=0;i< freq.length;i++){
//            if(freq[i]==2){
//                System.out.println(a[i]);
//                break;
//            }
//        }
    }
}
