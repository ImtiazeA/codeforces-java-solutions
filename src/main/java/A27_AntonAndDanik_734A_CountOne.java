import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A27_AntonAndDanik_734A_CountOne {

    // Standings ==> 247804

    public static void main(String[] args) {

        FastScanner sc = new FastScanner();

        int gameCount = sc.nextInt();
        String scores = sc.nextLine();

        int antonWinCount = 0;
        int danikWinCount = 0;

        for (int i = 0; i < scores.length(); i++) {
            if (scores.charAt(i) == 'A') {
                antonWinCount++;
            } else {
                danikWinCount++;
            }
        }

        String result;

        if (antonWinCount > danikWinCount) {
            result = "Anton";
        } else if (antonWinCount < danikWinCount) {
            result = "Danik";
        } else {
            result = "Friendship";
        }

        System.out.println(result);


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
