import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class A29_BeautifulYear_271A {

    // Standings ==> 239414

    public static void main(String[] args) {

        FastScanner sc = new FastScanner();

        int startYear = sc.nextInt();

        int year = getNextBeautifulYear(startYear);

        System.out.println(year);

    }

    private static int getNextBeautifulYear(int number) {

        for (int i = number + 1; i < Integer.MAX_VALUE; i++) {

            String numberAsString = String.valueOf(i);

            Set<String> uniqueDigitsAsString = new HashSet<>(Arrays.asList(numberAsString.split("")));

            if (uniqueDigitsAsString.size() == numberAsString.length()) {
                return i;
            }

        }

        return number;
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
