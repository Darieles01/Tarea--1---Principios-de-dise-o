//Dependency Inversion: Car depende de la interfaz IEngine y no de la implementacion
//KISS: Clase simple que no conoce detalles de bajo nivel
class Car {
    private IEngine engine;

    public Car(IEngine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }
}

//KISS: Interface simple que define el contrato para los motores
interface IEngine {

    void start();
    
}

class DisielEngine implements IEngine {
    public void start() {
        System.out.println("Diesel engine started.");
    }
}

class ElectricEngine implements IEngine {
    public void start() {
        System.out.println("Electric engine started.");
    }

    
}

class Main {
    public static void main(String[] args) {
        IEngine dieselEngine = new DisielEngine();
        Car dieselCar = new Car(dieselEngine);
        dieselCar.start();

        IEngine electricEngine = new ElectricEngine();
        Car electricCar = new Car(electricEngine);
        electricCar.start();
    }
}