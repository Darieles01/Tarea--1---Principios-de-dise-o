public class Main {
    //KISS: codigo simple que solo usa las interfaces necesarias
    public static void main(String[] args) {
        //Employee usa todas las interfaces
        Employee employee = new Employee();
        employee.work();
        employee.eat();
        employee.sleep();

        //Robot usa solo la interfaz Workable
        Robot robot = new Robot();
        robot.work();
    }
}
