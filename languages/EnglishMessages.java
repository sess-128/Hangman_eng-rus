package hangman.languages;

public enum EnglishMessages implements MessageProvider {
    ENTER_LETTER("Enter a letter"),
    NEED_ONE_CHARACTER("Invalid input: only one character is needed"),
    NEED_RUSSIAN_LETTER("Invalid input: only Russian letters are allowed"),
    USED_LETTERS("Used letters: "),
    REGEX("[a-zA-Z]+"),
    WIN("You win"),
    LOSE("You lose"),
    ALREADY_ENTERED_LETTER("You already entered this letter"),
    MISSING_LETTER("The letter is not in the word"),
    EMPTY("");

    private final String message;

    EnglishMessages(String message) {
        this.message = message;
    }

    @Override public String getMessage(Messages message) {
        return this.message;
    }
}

