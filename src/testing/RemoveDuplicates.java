package testing;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(4);
        list1.add(4);
        list1.add(3);
        list1.add(9);
        list1.add(0);

        list2.add(11);
        list2.add(4);
        list2.add(5);
        list2.add(3);
        list2.add(99);

        System.out.println(list1.toString());
        System.out.println(list2.toString());

        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        set.addAll(list1);
        set1.addAll(list2);

        for(int i=0;i<list2.size();i++){
            if(set.contains(list2.get(i))){
                list2.remove(list2.get(i--));
            }
        }

        for(int i=0;i<list1.size();i++){
            if(set1.contains(list1.get(i))){
                list1.remove(list1.get(i--));
            }
        }

        System.out.println(list1.toString());
        System.out.println(list2.toString());
    }


}
