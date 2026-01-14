public class AreaCalculationFixed {
    public static void main(String[] args) {
        // Usando Rectangle correctamente
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        
        // Usando Square correctamente
        Square square = new Square(5);
        System.out.println("Square area: " + square.calculateArea());
        
        // Liskov: Ambos pueden tratarse como Shape sin romper comportamiento
        printShapeArea(rectangle);
        printShapeArea(square);
    }
    
    // Liskov: Funciona correctamente con Rectangle y Square
    public static void printShapeArea(IShape shape) { // KISS: Método polimórfico simple que acepta cualquier Shape
        System.out.println("Area: " + shape.calculateArea());
    }
}

//LISKOV: interface que define el metodo en comun
interface IShape {

    int calculateArea();
    
}

//KISS: Clase Rectangulo implementa su propia logica
class Rectangle implements IShape {
    protected int width;
    protected int height;

    //Se asegura una inicializacion correcta de los atributos
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //DRY: Calculo del area en un solo lugar
    @Override
    public int calculateArea() {
        return width * height;
    }
}

class Square implements IShape {
    private int side;

    //KISS: Constructor simple
    public Square(int side) {
        this.side = side;
    }

    //LISKOV: Metodos especificos para la clase Square
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    //DRY: Calculo especifico para la clase Square
    @Override
    public int calculateArea() {
        return side * side;
    }
}

