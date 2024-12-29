package tcs;
import java.util.*;

public class JustifyWords {
        static final int R = 3;
        static final int C = 3;
        static final String OPS = "+-*%";

        // Define correct patterns for digits and operators
        static Map<String, String> patterns = new HashMap<String, String>() {{
            put("0", " * | || ||_ |");
            put("1", "   |  |  |");
            put("2", " * _|| |_ ");
            put("3", " * _|  _| ");
            put("4", "   || _|  |");
            put("5", " * |_ _|  ");
            put("6", " * |_ ||_|");
            put("7", " *  |  |  ");
            put("8", " * ||_||_|");
            put("9", " * || _|  ");
            put("+", "   |_|  |");
            put("-", "    _   ");
            put("*", " * * *  ");
            put("%", " * * | _");
            put("=", "  _  _  ");
        }};

        static String extractPattern(char[][] display, int start) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    sb.append(display[i][start + j]);
                }
            }
            return sb.toString();
        }

        static int hammingDist(String s1, String s2) {
            int diff = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) diff++;
            }
            return diff;
        }

        static String findMatch(String pattern) {
            for (Map.Entry<String, String> entry : patterns.entrySet()) {
                if (hammingDist(pattern, entry.getValue()) <= 1) {
                    return entry.getKey();
                }
            }
            return null;
        }

        static long evalExpr(String expr) {
            String[] tokens = expr.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
            long res = Long.parseLong(tokens[0]);

            for (int i = 1; i < tokens.length - 1; i += 2) {
                long num = Long.parseLong(tokens[i + 1]);
                switch (tokens[i]) {
                    case "+": res += num; break;
                    case "-": res -= num; break;
                    case "*": res *= num; break;
                    case "%":
                        if (num != 0) res %= num;
                        break;
                }
            }
            return res;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();

            char[][] display = new char[R][n * C];
            for (int i = 0; i < R; i++) {
                String line = sc.nextLine();
                for (int j = 0; j < n * C; j++) {
                    display[i][j] = j < line.length() ? line.charAt(j) : ' ';
                }
            }

            StringBuilder expr = new StringBuilder();
            String rhs = "";
            int faultyPos = -1;

            for (int i = 0; i < n; i++) {
                String pattern = extractPattern(display, i * C);
                String match = findMatch(pattern);

                if (match.equals("=")) {
                    rhs = expr.toString();
                    expr.setLength(0);
                } else {
                    expr.append(match);
                }
            }

            long expectedResult = Long.parseLong(expr.toString());
            expr.setLength(0);

            // Try each position to find the faulty one
            for (int pos = 0; pos < n; pos++) {
                String currPattern = extractPattern(display, pos * C);

                for (Map.Entry<String, String> entry : patterns.entrySet()) {
                    String val = entry.getKey();
                    String pat = entry.getValue();

                    if (hammingDist(currPattern, pat) == 1) {
                        // Try this alternative
                        StringBuilder testExpr = new StringBuilder();
                        for (int i = 0; i < n; i++) {
                            if (i == pos) {
                                testExpr.append(val);
                            } else {
                                testExpr.append(findMatch(extractPattern(display, i * C)));
                            }
                        }

                        String[] parts = testExpr.toString().split("=");
                        if (evalExpr(parts[0]) == Long.parseLong(parts[1])) {
                            faultyPos = pos + 1;
                            break;
                        }
                    }
                }
                if (faultyPos != -1) break;
            }

            System.out.println(faultyPos);
            sc.close();
        }
    }