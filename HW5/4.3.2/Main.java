public class Main {
    public static void main(String[] args) {
        CustomStringBuilder myStrBuilder = new CustomStringBuilder();

        String result = myStrBuilder
                .append("Я не люблю ")
                .append("Джаву")
                .insert(12, " (але це не точно) ")
                .append("!")
                .toString();

        System.out.println("Результат:");
        System.out.println(result);
        
        CustomStringBuilder builder2 = new CustomStringBuilder();
        System.out.println("\nПриклад 2:");
        System.out.println(builder2.append("Hello").insert(5, " World").toString());
    }
}
