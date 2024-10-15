package hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.StringJoiner;

public class TextRepository {
    private final static int START_COUNT = 1;
    private final static int END_COUNT = 49000;
    // метод для подсчета количества строк в файле
    private final String filePath;

    public TextRepository(String filePath) {
        this.filePath = filePath;
    }

    public String getRandom() throws IOException {
        File file = new File(filePath);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringJoiner joiner = new StringJoiner(" ");

        String line;
        while ((line = reader.readLine()) != null) joiner.add(line);
        String[] letters = joiner.toString().split(" ");
        reader.close();

        return letters[randomNumber()];
    }


    private int randomNumber() {
        Random random = new Random();
        return random.nextInt(END_COUNT);
    }
}
