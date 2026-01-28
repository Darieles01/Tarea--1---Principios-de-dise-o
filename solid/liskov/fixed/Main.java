public class Main {
    public static void main(String[] args) {
        // Usando Rectangle correctamente
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        
        // Usando Square correctamente
        Square square = new Square(5);
        System.out.println("Square area: " + square.calculateArea());

        // Liskov: Ambos pueden tratarse como Shape sin romper comportamiento
        PrintShapeArea.printShapeArea(rectangle);
        PrintShapeArea.printShapeArea(square);
    }
}
