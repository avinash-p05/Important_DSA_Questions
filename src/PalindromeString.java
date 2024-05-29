import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Boolean flag = true;
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.toLowerCase().charAt(i)!=str.toLowerCase().charAt(j))
                flag=false;
            i++;
            j--;
        }
        if(flag)
            System.out.println("Is Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
