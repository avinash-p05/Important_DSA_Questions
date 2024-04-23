import java.util.*;
//•	Write a program to find second largest and second minimum elements in the array.
public class SecondMinAndMax {
    public static void main(String[] args) {
        int[] arr = {1,7,3,4,5,6,3,4,6,7,5,4,6,7,8,8,5,4};
        int fmin=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        for(int num : arr){
            if(num<fmin){
                smin=fmin;
                fmin=num;
            } else if (num<smin && num!=fmin) {
                smin=num;
            }

            if(num>fmax){
                smax=fmax;
                fmax=num;
            } else if (num>smax && num!=fmax) {
                smax=num;
            }
        }
        System.out.println("Second Min : "+smin);
        System.out.println("Second Max : "+smax);

    }
}
