package easy;

import java.util.HashMap;

public class GenerateDocument {
    // O(n) Time/ O(n) Space
    public static boolean generateDocument(String characters, String document) {
        HashMap<Character, Integer> characterCounts = new HashMap<Character, Integer>();

        for (int i =0; i < characters.length(); i++) {
            char character = characters.charAt(i);
            characterCounts.put(character, characterCounts.getOrDefault(character,0) + 1);
        }

        for (int i =0; i < document.length(); i++) {
            char character = document.charAt(i);
            if (!characterCounts.containsKey(character) || characterCounts.get(character) == 0) {
                return false;
            }
            characterCounts.put(character,characterCounts.get(character) - 1);
        }

        return true;
    }
}
