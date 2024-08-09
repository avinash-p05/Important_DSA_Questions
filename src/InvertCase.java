public class InvertCase {
    public static void main(String[] args) {
        String str = "Avinash Rajaram Pauskar is a computer science student";
        String result = invertLastLetterCase(str);
        System.out.println(result);
    }

    public static String invertLastLetterCase(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                int lastCharIndex = word.length() - 1;
                char lastChar = word.charAt(lastCharIndex);
                char invertedLastChar;

                if (Character.isUpperCase(lastChar)) {
                    invertedLastChar = Character.toLowerCase(lastChar);
                } else {
                    invertedLastChar = Character.toUpperCase(lastChar);
                }

                result.append(word.substring(0, lastCharIndex))
                        .append(invertedLastChar)
                        .append(" ");
            }
        }

        // Remove the trailing space
        return result.toString().trim();
    }
}
