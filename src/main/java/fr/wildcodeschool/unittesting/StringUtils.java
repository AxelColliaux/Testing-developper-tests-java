package fr.wildcodeschool.unittesting;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringUtils {

    private static final String ALL_VOWELS = "aeiouyAEIOUY";

    /**
     * Renvoie la chaîne formée par les voyelles d'une chaîne de caractères
     * @return Chaîne avec uniquement des voyelles
     */
    public static String vowels(String candidate) {
        if (candidate == null) {
            throw new IllegalArgumentException("Le paramètre ne peut pas être null");
        }
        String vowels = "";
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                vowels += letters[i];
            }
        }
        return vowels;
    }

    /**
     * Renvoie la chaîne formée par les voyelles d'une chaîne de caractères, sans doublon
     * @return Chaîne avec uniquement des voyelles, sans doublon
     */
    public static String uniqueVowels(String candidate) {
        if (candidate == null) {
            throw new IllegalArgumentException("Le paramètre ne peut pas être null");
        }
        Set<Character> uniqueVowels = new LinkedHashSet<>();
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                uniqueVowels.add(letters[i]);
            }
        }
        StringBuilder result = new StringBuilder();
        for (Character vowel : uniqueVowels) {
            result.append(vowel);
        }
        return result.toString();
    }
}
