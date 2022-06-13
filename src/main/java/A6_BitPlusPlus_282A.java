import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A6_BitPlusPlus_282A {

    static class FastScanner {

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

    public static void main(String[] args) {

        FastScanner sc = new FastScanner();

        int m = sc.nextInt();

        int result = 0;

        for (int i = 0; i < m; i++) {

//            String statement = sc.next();
//
//            if (statement.startsWith("+") || statement.endsWith("+")) {
//                result++;
//            } else {
//                result--;
//            }


            char[] chars = sc.next().toCharArray();

            if (chars[1] == '+') {
                result++;
            } else {
                result--;
            }

        }

        System.out.println(result);

    }
}