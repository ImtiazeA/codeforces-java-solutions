import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A19_Elephant_617A {

    public static void main(String[] args) {

        FastScanner sc = new FastScanner();

        int distance = sc.nextInt();

        int stepsNeeded = stepsNeeded(distance);

        System.out.println(stepsNeeded);

    }

    private static int stepsNeeded(int distance) {

        // 1 to 5, these are all possible steps so at any given time, it can be reached with just 1 step
        if (distance <= 5) {
            return 1;
        }

        int stepsTaken = 0;

        for (int i = 5; i > 0 ; i--) {

            // steps taken for this unit
            int quotient = distance / i;

            // distance remaining after taking steps with this unit
            int remainder = distance % i;

            if (quotient > 0) {
                stepsTaken += quotient;
                distance = remainder;
            }

            // distance = 0, elephant is already on friends house, don't need to count steps anymore
            if (distance == 0) {
                break;
            }

        }

        return stepsTaken;

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
