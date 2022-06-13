import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A25_ChatRoom_58A_RegEx {

    // Standings ==>

    public static void main(String[] args) {

        FastScanner sc = new FastScanner();

        String messageSent = sc.nextLine();

        String updatedQueue = isMessageAccepted(messageSent);

        System.out.println(updatedQueue);

    }

    private static String isMessageAccepted(String messageSent) {

        if (messageSent.matches(".*h.*e.*l.*l.*o.*")) {
            return "YES";
        } else {
            return "NO";
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
