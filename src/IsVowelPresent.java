//
public class IsVowelPresent {
    public static void main(String[] args) {
        String str = "Avinash";
        String s = "TV";
        String isVowel=".*[aeiouAEIOU].*";
        System.out.println(str.matches(isVowel));
        System.out.println(s.matches(isVowel));
    }
}
