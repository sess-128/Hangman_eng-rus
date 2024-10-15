package hangman;

import hangman.common.HangmanRender;

import java.io.IOException;

public class MainTest {
    public static void main(String[] args) throws IOException {

        HangmanRender hangmanRender = new HangmanRender();

        String text = "многоножка";

        Word word = new Word(text);
        Game game = new Game(word, hangmanRender);
        game.start();

    }
}
