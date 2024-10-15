package hangman.languages;

public enum Messages {
    ENTER_LETTER,
    NEED_ONE_CHARACTER,
    NEED_RUSSIAN_LETTER,
    USED_LETTERS,
    REGEX,
    WIN,
    LOSE,
    ALREADY_ENTERED_LETTER,
    MISSING_LETTER;

    private static MessageProvider provider;

    public static void setLanguage(Language language){
        switch (language){
            case ENGLISH:
                provider = EnglishMessages.EMPTY;
                break;
            case RUSSIAN:
                provider = RussianMessages.EMPTY;
                break;
        }
    }

    public String getMessage() {
        if (provider == null){
            throw new IllegalStateException("Language not set");
        }
        return provider.getMessage(this);
    }

    public void print(){
        System.out.println(this.getMessage());
    }
}
