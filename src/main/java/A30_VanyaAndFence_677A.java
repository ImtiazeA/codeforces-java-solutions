import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A30_VanyaAndFence_677A {

    // Standings ==> 235016

    public static void main(String[] args) {

        FastScanner sc = new FastScanner();

        int friendCount = sc.nextInt();
        int fenceHeight = sc.nextInt();

        int rowWidth = 0;

        for (int i = 0; i < friendCount; i++) {
            int friendHeight = sc.nextInt();

            if (friendHeight > fenceHeight) {
                rowWidth += 2;
            } else {
                rowWidth++;
            }
        }

        System.out.println(rowWidth);

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
