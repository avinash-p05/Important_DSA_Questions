
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<2*n;i++){
            if(i<n){
                for(int j=0;j<=i;j++)
                    System.out.print("* ");
            }
            else{
                for(int j=0;j<2*n-i-1;j++)
                    System.out.print("* ");
            }
            System.out.println();
        }

    }
}
