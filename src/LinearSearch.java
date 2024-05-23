import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr  = {5,7,1,2,3,4,1};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int count=0;
        for(int i : arr){
            if(i==key)
                System.out.println(String.format("Key found at %d index",count));
            count++;
        }
    }
}
