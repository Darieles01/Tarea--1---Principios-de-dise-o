//Client code
public class DemoFixed {

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

//ISP: Interfaces pequeñas y específicas
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

//Employee implementa las interfaces que necesita
class Employee implements Workable, Eatable, Sleepable {
    @Override
    public void work() {
        System.out.println("Employee is working");
    }

    @Override
    public void eat() {
        System.out.println("Employee is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Employee is sleeping");
    }
}

//ISP, YANGI: Robot implementa solo la interfaz que necesita
class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }

}