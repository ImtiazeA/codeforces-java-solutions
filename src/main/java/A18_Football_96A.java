import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A18_Football_96A {

    public static void main(String[] args) {

        FastScanner sc = new FastScanner();

        String playerFormation = sc.nextLine();

        boolean dangerous = isFormationDangerous(playerFormation);

        String result = dangerous ? "YES" : "NO";

        System.out.println(result);

    }

    private static boolean isFormationDangerous(String playerFormation) {

        String lastPlayer = "";
        int consecutiveCount = 0;
        boolean dangerous = false;

        for (String currentPlayer : playerFormation.split("")) {

            if (lastPlayer.equals(currentPlayer)) {
                consecutiveCount++;
            } else {
                lastPlayer = currentPlayer;
                consecutiveCount = 1;
            }

            if (consecutiveCount == 7) {
                dangerous = true;
                break;
            }

        }

        return dangerous;


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
