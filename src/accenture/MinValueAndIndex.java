package accenture;

public class MinValueAndIndex {
    public static void main(String[] args) {
        int[] arr = {5,2,4,1,3};
        int min=arr[0];
        int idx=0;
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
                idx=i;
            }
        }
        System.out.println(arr[idx]+" "+idx);
    }

}
