import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A21_WrongSubtraction_977A {

    public static void main(String[] args) {

        FastScanner sc = new FastScanner();

        int number = sc.nextInt();
        int times = sc.nextInt();

        int convertedNumber = getResult(number, times);

        System.out.println(convertedNumber);

    }

    private static int getResult(int number, int times) {

        for (int i = 0; i < times; i++) {

            if (number % 10 == 0) {
                number = number / 10;
            } else {
                number--;
            }

        }

        return number;

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
