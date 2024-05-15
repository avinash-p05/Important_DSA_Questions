//
public class IsVowelPresent {
    public static void main(String[] args) {
        String str = "Avinash";
        String s = "TV";
        System.out.println(str.toLowerCase().matches(".*[aeiou].*"));
        System.out.println(s.toLowerCase().matches(".*[aeiou].*"));
        System.out.println(str.matches("[a-zA-Z_][a-z]"));
    }
}
