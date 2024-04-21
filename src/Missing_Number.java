//	Find the missing number, given an array of size N-1 with integers in the range of      [1, N].
//	Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
//	Output: 5


public class Missing_Number {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,3,7,8};
        int n =8;
        int actualSum =0;
        for(int i:arr)
            actualSum +=i;
        int originalSum=(n*(1+n))/2;
        System.out.println("Missing num - "+(originalSum- actualSum));
    }
}
