package hangman.common;

import hangman.Hangman;

public class        ColorHangmanRender extends HangmanRender {
    private final Color color;


    public ColorHangmanRender(Color color) {
        this.color = color;
    }

    @Override
    public void show(Hangman hangman) {
        System.out.print(color.getCode());
        super.show(hangman);
        System.out.print(Color.DEFAULT.getCode());
    }
}
