package pa.chan;

public class Main {
    static void main() {
        LetterReverser letterReverser = new LetterReverser();

        String text = "J@va the be$t!123";

        try {
            String reverseText = letterReverser.reverse(text);
            System.out.print(text + "\n" + reverseText);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

    }
}
