//Dependency Inversion: Car depende de la interfaz IEngine y no de la implementacion
//KISS: Clase simple que no conoce detalles de bajo nivel
public class Car {
    private IEngine engine;

    public Car(IEngine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }
}