package easy;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static int firstNonRepeatingCharacter(String text) {
        HashMap<Character, Integer> characterCounts = new HashMap<Character, Integer>();
        for (int i=0; i < text.length(); i++) {
            char character = text.charAt(i);
            characterCounts.put(character, characterCounts.getOrDefault(character,0) + 1);
        }
        for (int i=0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (characterCounts.get(character) == 0) {
                return i;
            }
        }
        return -1;
    }
}
