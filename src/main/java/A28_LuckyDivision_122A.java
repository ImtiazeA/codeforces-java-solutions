import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A28_LuckyDivision_122A {

    // Standings ==> 243786

    public static void main(String[] args) {

        FastScanner sc = new FastScanner();

        int number = sc.nextInt();

        boolean lucky = isLucky(number);

        System.out.println(lucky ? "YES" : "NO");

    }

    private static boolean isLucky(int number) {

        int[] luckyNumbers = {4,7,44,47,74,77,444,447,474,477,744,747,774,777};

        for (int luckyNumber : luckyNumbers) {
            if (number % luckyNumber == 0) {
                return true;
            }
        }

        String numberAsString = String.valueOf(number);

        boolean allLuckyChars = true;

        for (int i = 0; i < numberAsString.length(); i++) {

            boolean luckyChar = numberAsString.charAt(i) == '4' || numberAsString.charAt(i) == '7';

            if (!luckyChar) {
                allLuckyChars = false;
                break;
            }
        }

       return allLuckyChars;
    }

    private static class FastScanner {

        private final BufferedReader br;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        private StringTokenizer st = null;

        String nextLine() {
            String s = "";
            try {
                s = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return s;
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(this.next());
        }

        long nextLong() {
            return Long.parseLong(this.next());
        }

        double nextDouble() {
            return Double.parseDouble(this.next());
        }

    }

}
