import java.util.Scanner;

//•	Write a program to invert the ith bit of the given number and print the number formed.
public class iThBit {
    public static void main(String[] args) {
        int mask=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num -  ");
        int n = sc.nextInt();
        System.out.println("Enter the bit - ");
        int bit= sc.nextInt();
        int ref = n>>(bit+1);
        if(ref==0){
            mask=mask<<(bit+1);
            n= n|mask;
            System.out.println(n);
        }
        else{
            mask=~(mask<<(bit+1));
            n= n&mask;
            System.out.println(n);
        }

    }
}
