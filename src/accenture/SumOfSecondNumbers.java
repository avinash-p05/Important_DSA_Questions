package accenture;

public class SumOfSecondNumbers {
    public static void main(String[] args) {
        int[] arr = {3,2,1,7,5,44,3,5,23,34,21};

        int max1 = Integer.MIN_VALUE;
        int max2 = max1;

        int min1 = Integer.MAX_VALUE;
        int min2 = min1;

        for(int i=0;i<arr.length ; i++){
            if(i%2==0){
                if(arr[i]>max1){
                    max2 = max1;
                    max1 = arr[i];
                }
                if(arr[i]>max2 && arr[i]!=max1)
                    max2 = arr[i];

            }
            else{
                if(arr[i]<min1) {
                    min2 = min1;
                    min1 = arr[i];
                }
                if(arr[i] < min2 && min1!=arr[i])
                    min2=arr[i];
            }
        }
        System.out.println(min2);
        System.out.println(max2);
        System.out.println(max2+min2);
    }
}
