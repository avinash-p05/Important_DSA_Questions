package tcs;
import java.util.*;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer result = new StringBuffer();
        for(char c : s.toCharArray()){
            if(c>=65 && c<=91)
                result.append(s.toLowerCase().charAt(0)); //result.append((char)(c+32));
            else if(c>=97 && c<=122)
                result.append((char)(c-32));
            else
                result.append(c);
        }
        System.out.println(result.toString());
    }
}
