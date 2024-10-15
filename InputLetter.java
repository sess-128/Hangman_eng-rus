package hangman;

import hangman.languages.Language;
import hangman.languages.Messages;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputLetter {
    private final static Scanner scanner = new Scanner(System.in);


    public static String input(Language language) {
//        System.out.println("Введите букву:");
        Messages.setLanguage(language);

        Messages.ENTER_LETTER.print();

        String letter = scanner.nextLine();
        String regex = Messages.REGEX.getMessage();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(letter);

        if (letter.length() != 1) {
            Messages.NEED_ONE_CHARACTER.print();
        } else if (!Character.isLetter(letter.charAt(0)) || !matcher.find()) {
            Messages.NEED_RUSSIAN_LETTER.print();
        }

        return letter;
    }
}
