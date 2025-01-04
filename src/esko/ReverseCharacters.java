package esko;

import java.util.*;

public class ReverseCharacters {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the string:");
            String input = sc.nextLine();

            String result = reverseAlphabets(input);
            System.out.println("Output: " + result);
        }

        private static String reverseAlphabets(String input) {

            Stack<Character> stack = new Stack<>();

            for (char c : input.toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    stack.push(c);
                }
            }

            StringBuilder result = new StringBuilder();
            for (char c : input.toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    result.append(stack.pop());
                } else {
                    result.append(c);
                }
            }

            return result.toString();
        }
}
