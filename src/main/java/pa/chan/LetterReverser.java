package pa.chan;

public class LetterReverser {

    public String reverse(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Исходная строка не должна быть null");
        }

        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }
        }

        return new String(chars);
    }
}
