public class BitCountFromAtoB {
    public static void main(String[] args) {
        int a = 22;
        int b = 27;
        int count=0;
        int m = a^b;
        while(m!=0){
            //another way
//            if((m&1)==1)
//                count++;
//            m=m>>1;

            m = (m&(m-1));
            count++;
        }
        System.out.println("No of bits required to change a to b  - "+count);
    }
}
