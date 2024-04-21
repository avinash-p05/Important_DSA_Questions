import java.util.Arrays;
import java.util.Scanner;

//•	Write a program to check if given two strings are valid anagram
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean flag=true;
        if(s.length()!=t.length())
            flag=false;
        else{
            char[] ss =s.toLowerCase().toCharArray();
            char[] tt = t.toLowerCase().toCharArray();
            Arrays.sort(ss);
            Arrays.sort(tt);
            for(int i=0;i<ss.length;i++){
                if(ss[i]!=tt[i]){
                    flag=false;
                    break;
                }
            }
        }
        if(flag)
            System.out.println("Valid");
        else
            System.out.println("Not Valid");
    }
}
