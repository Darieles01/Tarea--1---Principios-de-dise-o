public class Main {
    public static void main(String[] args) {
        IEngine dieselEngine = new DisielEngine();
        Car dieselCar = new Car(dieselEngine);
        dieselCar.start();

        IEngine electricEngine = new ElectricEngine();
        Car electricCar = new Car(electricEngine);
        electricCar.start();
    }
}
