class Wheel {
}

class Engine {
}

class Car {
    private Wheel wheel;
    private Engine engine;

    public Car(Wheel wheel, Engine engine) {
        this.wheel = wheel;
        this.engine = engine;
    }
}

class CarBuilder {
    public Car build(Wheel wheel, Engine engine) {
        return new Car(wheel, engine);
    }
}

class CarSimulator {
    private CarBuilder carBuilder;
    private Car car;

    public CarSimulator() {
        this.carBuilder = new CarBuilder();
        this.car = carBuilder.build(new Wheel(), new Engine());
    }

    public void doSomethingWithWheel(Wheel wheel) {
    }
}
