package easy;

public class RunLengthEncoding {
    // O(n) Time/ O(n) Space
    public static String runLengthEncoding(String text) {
        StringBuilder encodedText = new StringBuilder();
        int counter = 0;
//        char tempChar = text.charAt(0);
//        for (int i = 0; i < text.length(); i++) {
//            if (text.charAt(i) == tempChar) {
//                counter++;
//                if (counter == 9 || i == text.length() - 1) {
//                    encodedText.append(counter);
//                    encodedText.append(tempChar);
//                    counter = 0;
//                }
//            } else {
//                encodedText.append(counter);
//                encodedText.append(tempChar);
//                tempChar = text.charAt(i);
//                counter = 1;
//            }
//        }
        for (int i=1; i< text.length(); i++) {
            char currentCharacter = text.charAt(i);
            char previousCharacter = text.charAt(i - 1);
            counter += 1;
            if (currentCharacter != previousCharacter || counter == 9 || (i + 1) == text.length()) {
                encodedText.append(counter);
                encodedText.append(previousCharacter);
                counter = 0;
            }
        }

        return encodedText.toString();
    }
}
