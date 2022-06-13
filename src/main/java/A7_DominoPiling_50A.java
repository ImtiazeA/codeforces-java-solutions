import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A7_DominoPiling_50A {

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
        int n = sc.nextInt();

//        int m_count;
//
//        int count = -1;
//
//        if (m < 2 || n < 2) {
//            int max = Math.max(m, n);
//            count = max / 2;
//
//        } else {
//            m_count = m / 2;
//            count = (m_count * n);
//
//            if (m % 2 != 0) {
//                count += (n / 2);
//            }
//
//        }

        System.out.println((m * n) / 2);

    }
}