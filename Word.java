package hangman;

import java.io.*;
import java.util.Arrays;

public class Word {
    private final char[] letters;
    private final char[] mask;

    public Word(String text) throws IOException {
        this.letters = text.toCharArray();
        this.mask = makeMask();
    }
    // разделить на два
    public char[]getMask() {
        return mask;
    }

    public char[] getLetters() {
        return letters;
    }

    public boolean contains(char letter) {
        return Arrays.toString(letters).contains(String.valueOf(letter));
    }

    public void openLetter(char letter) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == letter) {
                mask[i] = letter;
            }
        }
    }

    private char[] makeMask() {
        char[] mask = new char[letters.length];
        Arrays.fill(mask, '*');
        return mask;
    }


}
