package hangman.common;

public enum Color {
    DEFAULT("\033[0m"),
    RED("\033[0;31m"),
    GREEN("\033[0;32m");
    private final String code;

    public String getCode() {
        return code;
    }

    Color(String code) {
        this.code = code;
    }
}
