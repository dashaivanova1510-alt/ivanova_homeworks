public class Main {
    public static void main(String[] args) {

        

        Director director = Director.getInstance();
        CarBuilder builder = new CarBuilder();


        director.constructPowerfulSUV(builder);
        Car suv = builder.build();

        System.out.println("--- Машина від єдиного Директора ---");
        System.out.println(suv);


        Director anotherDirectorReference = Director.getInstance();
        if (director == anotherDirectorReference) {
            System.out.println("\nВсе вірно: іншого директора на заводі немає, це той самий об'єкт.");
        }
    }
}
