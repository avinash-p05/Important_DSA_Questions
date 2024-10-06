package tcs;

import java.util.*;

public class CountSundays{
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        int n = sc.nextInt();
        map.put("sun",0);
        map.put("mon",1);
        map.put("tue",2);
        map.put("wed",3);
        map.put("thur",4);
        map.put("fri",5);
        map.put("sat",6);

        n+=map.get(day);
        System.out.println((int)n/7);
    }
}
