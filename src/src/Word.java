package src;

import java.util.ArrayList;

/**
 * @author Inderpreet
 * @date Oct 7, 2014
 */
public class Word {

    private final String input;
    private final String[] toRemove = {".", ",", "\'", ";", ":", "/", "?", "<",
        ">", "\"", "“", "”", "‘", "’", "{", "}", "[", "]", "|", "\\", "(", ")",
        "!", "@", "#", "$", "%", "^", "&", "*", "-", "+", "=", "_", "~", "`",
        "\n", System.getProperty("line.separator"), " ", ""};

    public Word(String term) {
        input = term;
    }

    /**
     * Returns true if word is spelled correctly
     *
     * @param dictionary ArrayList o words
     * @return boolean Whether a word is real
     */
    public boolean isWord(ArrayList dictionary) {
        String fixed = removeSpecial();
        return (dictionary.contains(fixed.toLowerCase()));
    }

    /**
     * Gets the word
     *
     * @return String word
     */
    public String getWord() {
        return input;
    }

    /**
     * Removes special characters from a string
     *
     * @return String without any special characters
     */
    private String removeSpecial() {
        String fixed = input;
        fixed = fixed.trim();
        for (String s : toRemove) {
            fixed = fixed.replace(s, "");
        }
        return fixed;
    }
}