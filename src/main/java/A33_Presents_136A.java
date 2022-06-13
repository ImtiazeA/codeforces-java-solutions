import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A33_Presents_136A {

    // Standings ==> 

    public static void main(String[] args) {

        FastScanner sc = new FastScanner();

        int roomCount = sc.nextInt();

        int movableCount = 0;

        for (int i = 0; i < roomCount; i++) {
            int livingCount = sc.nextInt();
            int capacity = sc.nextInt();

            if ((livingCount + 2) <= capacity) {
                movableCount++;
            }

        }

        System.out.println(movableCount);

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
