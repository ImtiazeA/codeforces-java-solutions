import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A5_NextRound_158A {

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

        int n = sc.nextInt();
        int k = sc.nextInt();

        int passed_count = 0;
        int kth_score = -1;


        for (int i = 0; i < n; i++) {

            int score = sc.nextInt();

            if (i == (k - 1)) {
                kth_score = score;
            }

            if (kth_score > 0 && kth_score != score) {
                break;
            }

            if (score > 0) {
                passed_count++;
            } else {
                break;
            }

        }


        System.out.println(passed_count);

    }
}