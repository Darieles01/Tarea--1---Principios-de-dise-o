//Cada figura implementa su propia logica para calcular el area
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    //Open-Close: Agregar una figura no requiere modificar codigo existente
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
