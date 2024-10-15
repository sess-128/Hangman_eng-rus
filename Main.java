package hangman;

import hangman.common.HangmanRender;
import hangman.common.LettersPoolRender;
import hangman.common.WordRender;

import java.io.IOException;

import static hangman.InputLetter.input;

public class Main {
    private final static String FILE_PATH = "./src/Hangman/Common/russianWords.txt";

    public static void main(String[] args) throws IOException {


        TextRepository repository = new TextRepository(FILE_PATH);
        HangmanRender hangmanRender = new HangmanRender();
        String text = repository.getRandom();

        Word word = new Word(text);
        Game game = new Game(word, hangmanRender);
        game.start();



    }
}
