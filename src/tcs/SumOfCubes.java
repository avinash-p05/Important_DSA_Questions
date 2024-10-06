package tcs;

import java.util.*;

public class SumOfCubes{
    public static void main(String[] args){
        int a=4;
        int b=99;
        int sum=0;
        for(int i=a;i<=b;i++)
            sum+=i*i*i;
        System.out.println(sum);
        }
}

