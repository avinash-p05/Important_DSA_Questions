import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int mid,low=0,high=arr.length-1;
        Scanner sc = new Scanner(System.in);
        boolean flag=false;
        int key = sc.nextInt();
        while(low<=high){
            mid = low + (high - low)/2;
            if(arr[mid]==key){
                System.out.println(String.format("Key found at %d index",mid));
                flag=true;
                break;
            }
            else if(arr[mid]>key)
                high=mid-1;
            else
                low = mid+1;
        }
        if(!flag)
            System.out.println("Key not found!!");
    }
}
