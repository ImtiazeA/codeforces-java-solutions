import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A15_BeanAndBigBrother_791A {

    public static void main(String[] args) {

        FastScanner sc = new FastScanner();

        int weightLimak = sc.nextInt();
        int weightBob = sc.nextInt();

        int count = getCount(weightLimak, weightBob);

        System.out.println(count);

    }

    private static int getCount(int weightLimak, int weightBob) {

        int yearsTook = -1;

        for (int i = 1; i < Integer.MAX_VALUE; i++) {

            weightLimak = weightLimak * 3;
            weightBob = weightBob * 2;

            if ( weightLimak > weightBob){

                yearsTook = i;

                break;

            }

        }

        return yearsTook;

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
