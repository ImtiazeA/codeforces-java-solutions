import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A24_QueueAtTheSchool_266A {

    // Standings ==> 262813

    public static void main(String[] args) {

        FastScanner sc = new FastScanner();

        int studentCount = sc.nextInt();
        int steps = sc.nextInt();
//        sc.nextLine();
        String initialQueue = sc.nextLine();

        String updatedQueue = getUpdatedQueue(studentCount, steps, initialQueue);

        System.out.println(updatedQueue);

    }

    private static String getUpdatedQueue(int studentCount, int steps, String initialQueue) {

        String[] positions = initialQueue.split("");

        for (int i = 0; i < steps; i++) {

            for (int j = 1; j < positions.length; j++) {

                if (positions[j - 1].equals("B") && positions[j].equals("G")) {
                    positions[j - 1] = "G";
                    positions[j] = "B";
                    j++;
                }

            }
        }
        return String.join("", positions);

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
