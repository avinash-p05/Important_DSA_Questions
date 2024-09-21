//•	Given a string, output count of each character and the character.
//o Input: aaabbcd o Output: 3a2b1c1d


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character,Integer> map = new HashMap<>();
        int count;
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
               count=map.get(c);
               map.put(c,count+1);
            }
            else{
                map.put(c,1);
            }
        }



        for(Map.Entry<Character,Integer> e : map.entrySet() )
            System.out.print(e.getValue()+""+e.getKey());
    }
}
