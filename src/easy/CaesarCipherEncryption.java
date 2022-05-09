package easy;

public class CaesarCipherEncryption {
    // O(n) Time/ O(n) Space
    public static String caesarCipherEncryption(String text, int key) {
        int numberOfLetters = 26;
        int initialValue = 97;
        StringBuilder encodedText = new StringBuilder();
        for (int i=0; i<text.length(); i++) {
            char tempChar = text.charAt(i);
            encodedText.append((char) (((int) tempChar + key - initialValue) % numberOfLetters + initialValue));
        }
        return encodedText.toString();
    }
}
