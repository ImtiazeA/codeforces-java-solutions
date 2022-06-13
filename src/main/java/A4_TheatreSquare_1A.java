import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A4_TheatreSquare_1A {

    static class FastScanner {

        private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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

        double n = sc.nextDouble();
        double m = sc.nextDouble();
        double a = sc.nextDouble();

        long n_count = (long) Math.ceil(n / a);
        long m_count = (long) Math.ceil(m / a);

        long total = n_count * m_count;

        System.out.println(total);

    }
}