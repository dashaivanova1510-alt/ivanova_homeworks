public class Vehicle {
    private String model;
    private int age;
    private float damaged; 
    private int mileage;

    public Vehicle(String model, int age, float damaged, int mileage) {
        this.model = model;
        this.age = age;
        this.damaged = damaged;
        this.mileage = mileage;
    }

    public int getAge() { return age; }
    public String getModel() { return model; }
    public float getDamage() { return damaged; }
    public int getMileage() { return mileage; }
}

class Car extends Vehicle {
    public Car(String model, int age, float damaged, int mileage) {
        super(model, age, damaged, mileage);
    }
}
