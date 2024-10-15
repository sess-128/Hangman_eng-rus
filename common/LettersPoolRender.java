package hangman.common;

import hangman.LettersPool;
import hangman.languages.Language;
import hangman.languages.Messages;

import java.util.List;

public class LettersPoolRender {
    public void show(LettersPool lettersPool, Language language) {
        List<Character> list = lettersPool.toList();
        Messages.setLanguage(language);
        Messages.USED_LETTERS.print();
        for (Character c : list) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
