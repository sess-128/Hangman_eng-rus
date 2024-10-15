package hangman;

import hangman.common.Color;
import hangman.common.ColorHangmanRender;
import hangman.common.HangmanRender;

import java.io.IOException;

public class MainColor {
    private final static String FILE_PATH = "./src/Hangman/Common/russianWords.txt";

    public static void main(String[] args) throws IOException {


        TextRepository repository = new TextRepository(FILE_PATH);
        HangmanRender hangmanRender = new ColorHangmanRender(Color.GREEN);
        String text = repository.getRandom();

        Word word = new Word(text);
        Game game = new Game(word, hangmanRender);
        game.start();

    }
}
