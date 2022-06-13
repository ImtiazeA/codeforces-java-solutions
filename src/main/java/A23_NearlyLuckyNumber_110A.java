import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A23_NearlyLuckyNumber_110A {

    // Standings ==> 268318

    public static void main(String[] args) {

        FastScanner sc = new FastScanner();

        String numberAsString = sc.nextLine();

        boolean lucky = isLucky(numberAsString);

        String resultString = lucky ? "YES" : "NO";

        System.out.println(resultString);

    }

    private static boolean isLucky(String numberAsString) {

        int luckyCount = 0;

        for (int i = 0; i < numberAsString.length(); i++) {

            if (numberAsString.charAt(i) == '4' || numberAsString.charAt(i) == '7') {
                luckyCount++;
            }

        }

        return luckyCount == 4 || luckyCount == 7;

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
