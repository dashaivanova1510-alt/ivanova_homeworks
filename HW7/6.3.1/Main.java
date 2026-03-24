public class Main {
    public static void main(String[] args) {

        TextFileManager editor1 = TextFileManager.getInstance();
        TextFileManager editor2 = TextFileManager.getInstance();


        if (editor1 == editor2) {
            System.out.println("Одинак працює: обидва посилання вказують на один об'єкт.");
        }


        String fileName = "test.txt";
        String content = "Це тестовий текст для нашого редактора.\nJava - це весело (ні).";

        editor1.writeFile(fileName, content);
        
        String readData = editor2.readFile(fileName);
        System.out.println("\nЗміст файлу:\n" + readData);
        
        int words = editor1.countWords(readData);
        System.out.println("\nКількість слів у тексті: " + words);
    }
}
