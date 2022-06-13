import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A8_BeautifulMatrix_263A {

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

        int distance = -1;

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                int cellVal = sc.nextInt();

                if (cellVal == 1) {
                    distance = Math.abs(i - 2) + Math.abs(j - 2);
                }

            }

            if (distance >= 0) {
                break;
            }

        }

        System.out.println(distance);

    }
}