import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A14_StoneOnTheTable_266A {

    public static void main(String[] args) {

        FastScanner sc = new FastScanner();

        int stoneCount = sc.nextInt();
//        sc.nextLine();
        String line = sc.nextLine();

        int count = getCount(line);

        System.out.println(count);

    }

    private static int getCount(String line) {

        int count = 0;
        char lastColor = 'X';

        for (int i = 0; i < line.length(); i++) {

            char currentColor = line.charAt(i);

            if (lastColor == currentColor) {
                count++;
            }

            lastColor = currentColor;

        }


        return count;
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
