package hangman.languages;

public enum RussianMessages implements MessageProvider {
    ENTER_LETTER("Введите букву"),
    NEED_ONE_CHARACTER("Некорректный ввод: нужен всего 1 символ"),
    NEED_RUSSIAN_LETTER("Некорректный ввод: нужно вводить только русскую букву"),
    USED_LETTERS("Использованные буквы: "),
    REGEX("[а-яёА-ЯЁ]+"),
    WIN("Вы победили"),
    LOSE("Вы проиграли"),
    ALREADY_ENTERED_LETTER("Уже вводили такую букву"),
    MISSING_LETTER("Такой буквы нет в слове"),
    EMPTY("");

    private final String message;

    RussianMessages(String message) {
        this.message = message;
    }

    @Override
    public String getMessage(Messages message) {
        return this.message;
    }
}
