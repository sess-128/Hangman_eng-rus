package hangman;

import hangman.common.HangmanRender;
import hangman.common.LettersPoolRender;
import hangman.common.WordRender;

import java.io.IOException;

import static hangman.InputLetter.input;

public class Game {
    private final Word word;
    private final HangmanRender hangmanRender;

    public Game(Word word, HangmanRender hangmanRender) {
        this.word = word;
        this.hangmanRender = hangmanRender;
    }
    public void start() throws IOException {

        WordRender wordRender = new WordRender();

        LettersPoolRender renderPool = new LettersPoolRender();
        LettersPool lettersPool = new LettersPool();

        Hangman hangman = new Hangman();


        Rules rules = new Rules();



        hangmanRender.show(hangman);
        wordRender.show(word);
        renderPool.show(lettersPool);

        while (true) {
            char letter = input().charAt(0);


            if (lettersPool.contains(letter)) {
                System.out.println("Уже вводили такую букву");
                continue;
            }

            lettersPool.addLetter(letter);

            if (word.contains(letter)){
                word.openLetter(letter);
            } else {
                hangman.incrementStep();
                System.out.println("Такой буквы нет в слове");
            }

            hangmanRender.show(hangman);
            wordRender.show(word);
            renderPool.show(lettersPool);

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
    private void printWin(){
        System.out.println("Вы победили!");
    }
    private void printLose(){
        System.out.println("Вы проиграли!");
    }

}
