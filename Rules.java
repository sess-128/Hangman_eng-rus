package hangman;

import java.util.Arrays;

public class Rules {
    public boolean isWin(Word word){
        char[] letters = word.getLetters();
        char[] mask = word.getMask();

        return Arrays.equals(letters, mask);
    }
    public boolean isLose(Hangman hangman){
        return hangman.isDead();
    }
}
