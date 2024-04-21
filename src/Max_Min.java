//•	Write a program to find the maximum and minimum elements in the array.
import java.util.Arrays;

public class Max_Min {
    public static void main(String[] args) {
        int[] a = {2,4,5,65,43,67,8,4,34,67,3,5,7};
        Arrays.sort(a);
        System.out.println("Min "+a[0]);
        System.out.println("Max "+a[a.length-1]);
        System.out.println(0%2);
    }
}
