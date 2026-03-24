public class CustomStringBuilder {
    private StringBuilder buffer;

    public CustomStringBuilder() {
        this.buffer = new StringBuilder();
    }


    public CustomStringBuilder append(String str) {
        if (str != null) {
            buffer.append(str);
        }
        return this; 
    }


    public CustomStringBuilder insert(int offset, String str) {
        if (str != null && offset >= 0 && offset <= buffer.length()) {
            buffer.insert(offset, str);
        } else {
            System.out.println("Помилка: невірна позиція для вставки!");
        }
        return this;
    }


    @Override
    public String toString() {
        return buffer.toString();
    }
}
