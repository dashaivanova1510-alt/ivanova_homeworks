import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TextFileManager {


    private static TextFileManager instance;


    private TextFileManager() {
        System.out.println("Менеджер файлів ініціалізовано.");
    }


    public static TextFileManager getInstance() {
        if (instance == null) {
            instance = new TextFileManager();
        }
        return instance;
    }


    public String readFile(String filePath) {
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            return "Помилка при читанні: " + e.getMessage();
        }
    }


    public void writeFile(String filePath, String content) {
        try {
            Files.write(Paths.get(filePath), content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Файл успішно збережено: " + filePath);
        } catch (IOException e) {
            System.out.println("Помилка при записі: " + e.getMessage());
        }
    }


    public int countWords(String text) {
        if (text == null || text.isEmpty()) return 0;
        return text.trim().split("\\s+").length;
    }
}
