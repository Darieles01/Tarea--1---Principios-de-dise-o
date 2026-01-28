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