abstract class Shape {

    //KISS: Metodo que todas las figuras utilizaran
    public abstract double calculateArea();

}

//Cada figura implementa su propia logica para calcular el area
class Circle extends Shape {
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

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class ShapeCalculator{

    //DRY: Se calcula el area total en un solo metodo
    //KISS: Se mantiene la logica simple y directa implementando poliformismo
    public double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

}
