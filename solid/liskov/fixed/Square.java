public class Square implements IShape {
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
