import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class A13_BoyOrGirl_236A {

    public static void main(String[] args) {

        FastScanner sc = new FastScanner();

        String username = sc.nextLine();

        boolean isFemale = isFemale(username);

        String verdict = isFemale ? "CHAT WITH HER!" : "IGNORE HIM!";

        System.out.println(verdict);

    }

    private static boolean isFemale(String username) {

        long count = Arrays.stream(username.split(""))
                .distinct()
                .count();

        return count % 2 == 0;

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
