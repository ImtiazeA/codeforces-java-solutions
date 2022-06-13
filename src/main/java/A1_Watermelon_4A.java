import java.util.Scanner;

public class A1_Watermelon_4A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int weight = input.nextInt();

        if (weight > 2 && weight % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        input.close();

    }
}
