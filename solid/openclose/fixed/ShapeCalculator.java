public class ShapeCalculator{
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