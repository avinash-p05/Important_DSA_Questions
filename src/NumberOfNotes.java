public class NumberOfNotes {
    public static void main(String[] args) {
            int n= 84;
            int[] denominations = {100, 50, 20, 5};
            int count = 0;

            for (int denomination : denominations) {
                count += n / denomination;
                n %= denomination;
            }

            // If there's any remaining amount, we need an additional 5 rupee note
            if (n > 0) {
                count++;
            }

        System.out.println(count);
    }
}
