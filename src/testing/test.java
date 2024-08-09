package testing;

public class test {
    public static void main(String[] args) {
        int n=20;
        int i=1,f=1;
        int s=0;
        while(i<=n){
            f = f*i;
            s += (i/f);
            i++;
        }
        System.out.println(s);
    }
}
