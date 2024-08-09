package accenture;

public class AbsoluteDiff {
    public static void main(String[] args) {
        int[] arr = {12,3,14,56,77,13};
        int num  = 13;
        int diff = 2;
        int c = count(arr,num,diff);
        System.out.println(c);
    }

    private static int count(int[] arr, int num, int diff) {
        int count=0;
        for(int i : arr){
            System.out.println(Math.abs(i-num));
            if(Math.abs(i-num)<=diff)
                count++;
        }
        return count;
    }
}
