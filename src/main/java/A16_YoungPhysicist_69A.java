import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A16_YoungPhysicist_69A {

    public static void main(String[] args) {

        FastScanner sc = new FastScanner();

        boolean equilibrium = isEquilibrium(sc);

        String value = equilibrium ? "YES" : "NO";

        System.out.println(value);

    }

    private static boolean isEquilibrium(FastScanner sc) {

        int lines = sc.nextInt();

        int xSum = 0;
        int ySum = 0;
        int zSum = 0;

        for (int i = 0; i < lines; i++) {

            for (int j = 0; j < 3; j++) {

                if (j == 0) {
                    xSum += sc.nextInt();
                } else if (j == 1) {
                    ySum += sc.nextInt();
                } else {
                    zSum += sc.nextInt();
                }

            }

        }

        return xSum == 0 && ySum == 0 && zSum == 0;


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
