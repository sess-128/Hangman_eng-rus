package hangman;

import hangman.common.HangmanRender;
import hangman.languages.Language;
import hangman.languages.Messages;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private final static String FILE_PATH = "./src/Hangman/Common/russianWords.txt";

    public static void main(String[] args) throws IOException {


        TextRepository repository = new TextRepository(FILE_PATH);
        HangmanRender hangmanRender = new HangmanRender();
        String text = repository.getRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите язык/Select language (en/ru): ");
        String languageInput = scanner.nextLine();

        Language language;
        if (languageInput.equals("ru")){
            language = Language.RUSSIAN;
        } else {
            language = Language.ENGLISH;
        }

        Messages.setLanguage(language);

        Word word = new Word(text);
        Game game = new Game(word, hangmanRender);
        game.start();



    }
}
