import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A20_Word_59A {

    public static void main(String[] args) {

        FastScanner sc = new FastScanner();

        String line = sc.nextLine();

        String convertedWord = getConvertedWord(line);

        System.out.println(convertedWord);

    }

    private static String getConvertedWord(String line) {

        CaseCount lowerAndUpperCount = getLowerAndUpperCount(line);

        if (lowerAndUpperCount.getLowerCount() < lowerAndUpperCount.getUpperCount()) {
            return line.toUpperCase();
        } else {
            return line.toLowerCase();
        }

    }

    private static CaseCount getLowerAndUpperCount(String line) {

        int lowerCount = 0;
        int upperCount = 0;

        for (int i = 0; i < line.length(); i++) {

            if (Character.isLowerCase(line.charAt(i))) {
                lowerCount++;
            } else {
                upperCount++;
            }

        }

        return new CaseCount(lowerCount, upperCount);

    }

    private static final class CaseCount {
        private final int lowerCount;
        private final int upperCount;

        public CaseCount(int lowerCount, int second) {
            this.lowerCount = lowerCount;
            this.upperCount = second;
        }

        public int getLowerCount() {
            return lowerCount;
        }

        public int getUpperCount() {
            return upperCount;
        }
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
