package tcs;

import java.util.*;

public class MyClass{
    public static void main(String[] args){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                sum += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                i++;
            } else {
                sum += map.get(s.charAt(i));
            }
        }
        System.out.println(sum);

    }
}