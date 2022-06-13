import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A17_SoldierAndBananas_546A {

    public static void main(String[] args) {

        FastScanner sc = new FastScanner();

        int firstItemCost = sc.nextInt();
        int soldierHas = sc.nextInt();
        int wantToBuyCount = sc.nextInt();

        int borrowAmount = getBorrowAmount(firstItemCost, soldierHas, wantToBuyCount);

        System.out.println(borrowAmount);

    }

    private static int getBorrowAmount(int firstItemCost, int soldierHas, int wantToBuyCount) {

        int cost = 0;

        for (int i = 1; i <= wantToBuyCount; i++) {

            // he has to pay i·k dollars for the i-th banana
            cost += i * firstItemCost;

        }

        if (cost < soldierHas) {
            return 0;
        } else {
            return cost - soldierHas;
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
