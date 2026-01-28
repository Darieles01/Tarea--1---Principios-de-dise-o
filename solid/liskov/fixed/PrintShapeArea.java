public class PrintShapeArea {
    // Liskov: Funciona correctamente con Rectangle y Square
    public static void printShapeArea(IShape shape) { // KISS: Método polimórfico simple que acepta cualquier Shape
        System.out.println("Area: " + shape.calculateArea());
    }
}

