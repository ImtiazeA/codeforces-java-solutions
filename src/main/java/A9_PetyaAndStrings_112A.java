import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A9_PetyaAndStrings_112A {

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

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int compareResult = s1.toLowerCase().compareTo(s2.toLowerCase());

        int printResult;

        if (compareResult == 0) {
            printResult = 0;
        } else if (compareResult < 0) {
            printResult = -1;
        } else {
            printResult = 1;
        }

        System.out.println(printResult);

    }

}