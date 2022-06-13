import java.util.Scanner;

public class A2_WayTooLongWords_71A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lineCount = input.nextInt();

        // handle the line break buffer
        input.nextLine();

        for (int i = 0; i < lineCount; i++) {

            String word = input.nextLine();

            if (word.length() > 10) {

                char firstChar = word.charAt(0);
                int charInBetween = word.length() - 2;
                char lastChar = word.charAt(word.length() - 1);

                String replacedWord = firstChar + "" + charInBetween + "" + lastChar + "";

                System.out.println(replacedWord);
            } else {
                System.out.println(word);
            }

        }

        input.close();

    }
}
