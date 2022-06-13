import java.math.BigInteger;

public class BaseConversion {
    public static void main(String[] args) {

        String ff = new BigInteger("FF", 16)
                .toString(8);

        System.out.println(ff);

    }
}
