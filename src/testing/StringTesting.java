package testing;

public class StringTesting {
    public static void main(String[] args) {
        String s1 = null ;
        String s2 = "";
        String s3 = " ";

        System.out.println("S2 - "+s2.isEmpty());
        System.out.println("S2 - "+s2.isBlank());
        System.out.println("S3 - "+s3.isBlank());
        System.out.println("S3 - "+s3.isEmpty());
    }
}
