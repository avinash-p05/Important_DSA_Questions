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
        while(n>=5){
            if(n>=2000){
                count+=n/2000;
                n=n%2000;
            }
           else if(n>=500){
               count+=n/500;
               n=n%500;
           }
            else if(n>=200){
                count+=n/200;
                n=n%200;
            }

            else if(n>=100){
                count+=n/100;
                n=n%100;
            }

            else if(n>=50){
                count+=n/50;
                n=n%50;
           }

            else if(n>=20){
                count+=n/20;
                n=n%20;
            }

            else if(n>=10){
                count+=n/10;
                n=n%10;
            }

            else if(n>=5){
                count+=n/5;
                n=n%5;
            }
        }
        System.out.println(count+n);
    }
}
