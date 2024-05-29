import java.util.Arrays;
import java.util.Scanner;

public class OccurrencesOfWord {
    public static void main(String[] args) {
        String str = "the elephant is the largest animal in the world";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        int count=0;
        for(String s : arr)
            if(key.equals(s))
                count++;
        System.out.println("Count of "+key+" is "+count);


    }
}
