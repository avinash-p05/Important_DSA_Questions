import java.util.Scanner;

//•	Write a program to count the number of vowels and consonants in the string.
public class CountVandC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str.toLowerCase();
        int Vcount=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' )
                Vcount++;
        }
        System.out.println("Vowels - "+Vcount);
        System.out.println("Consonants - "+(str.length()-Vcount));
    }
}
