package accenture;

public class postiveAvg {
    public static void main(String[] args) {
        float f = 0.123456789123456f;
        double d = 0.1234;
        System.out.println(d);
        System.out.println(f);
//        int[] arr = {5,2,-4,1,3};
//        int a = avg(arr);
//        System.out.println(a);
    }

    private static int avg(int[] arr) {
        double P_sum = 0;
        double P_count = 0;
        for(int i : arr){
            if(i>0){
                P_sum+=i;
                P_count++;
            }
        }
        int a;
        if(P_count==0)
            return -1;
        else
            a = (int) Math.round(P_sum/P_count);
        return a;
    }
}
