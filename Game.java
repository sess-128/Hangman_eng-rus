package hangman;

import hangman.common.HangmanRender;
import hangman.common.LettersPoolRender;

import hangman.common.WordRender;
import hangman.languages.Language;
import hangman.languages.Messages;

import java.io.IOException;
import java.util.Scanner;

import static hangman.InputLetter.input;

public class Game {
    private final Word word;
    private final HangmanRender hangmanRender;

    public Game(Word word, HangmanRender hangmanRender) {
        this.word = word;
        this.hangmanRender = hangmanRender;
    }

    public Language selectLanguage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите язык/Select language (en/ru): ");
        String languageInput = scanner.nextLine();

        Language language;
        if (languageInput.equals("ru")){
           return language = Language.RUSSIAN;
        } else {
           return language = Language.ENGLISH;
        }

    }
    public void start() throws IOException {
        Language language = selectLanguage();

        WordRender wordRender = new WordRender();

        LettersPoolRender renderPool = new LettersPoolRender();
        LettersPool lettersPool = new LettersPool();

        Hangman hangman = new Hangman();
        Rules rules = new Rules();



        hangmanRender.show(hangman);
        wordRender.show(word);
        renderPool.show(lettersPool, language);

        while (true) {
            char letter = input(language).charAt(0);


            if (lettersPool.contains(letter)) {
                Messages.ALREADY_ENTERED_LETTER.print();
                continue;
            }

            lettersPool.addLetter(letter);

            if (word.contains(letter)){
                word.openLetter(letter);
            } else {
                hangman.incrementStep();
                Messages.MISSING_LETTER.print();
            }

            hangmanRender.show(hangman);
            wordRender.show(word);
            renderPool.show(lettersPool, language);

            if (rules.isLose(hangman)){
                printLose();
                return;
            }

            if (rules.isWin(word)){
                printWin();
                return;
            }
        }
    }
    private void printWin(){ System.out.println(Messages.WIN.getMessage());}
    private void printLose(){ System.out.println(Messages.LOSE.getMessage());}

}
