package hangman.common;

import hangman.Word;

public class WordRender {
    public void show(Word wordTest) {
        System.out.println(wordTest.getMask());
    }
}
