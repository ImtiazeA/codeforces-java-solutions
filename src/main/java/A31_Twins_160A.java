import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A31_Twins_160A {

    // Standings ==> 230741

    public static void main(String[] args) {

        FastScanner sc = new FastScanner();

        int coinCount = sc.nextInt();
        int[] coinAmounts = new int[coinCount];

        int total = 0;

        for (int i = 0; i < coinCount; i++) {
            int coinAmount = sc.nextInt();
            coinAmounts[i] = coinAmount;
            total += coinAmount;
        }

        Arrays.sort(coinAmounts);

        int coinTaken = 0;
        int coinTakenAmount = 0;
        int reverseIndex = 1;

        while (!(coinTakenAmount > (total / 2))) {

            int lastCoinAmount = coinAmounts[coinAmounts.length - reverseIndex];
            coinTakenAmount += lastCoinAmount;
            coinTaken++;

            reverseIndex++;

        }


        System.out.println(coinTaken);

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
