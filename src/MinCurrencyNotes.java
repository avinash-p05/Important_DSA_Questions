//•	Find minimum number of currency notes and values that sum to given amount o We may assume that we have infinite supply of notes of values {2000, 500,
//        200, 100, 50, 20, 10, 5, 1} o Input : 800
//o Output : Currency  Count
//         500 : 1
//                 200 : 1
//                 100 : 1


import java.util.Scanner;

public class MinCurrencyNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int[] notes = {2000,500,200,100,50,20,10,5,2};

        for(int note:notes){
            count+=n/note;
            n%=note;
        }
        System.out.println(count+n);
    }
}
