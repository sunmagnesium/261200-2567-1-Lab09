public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        try {
           
            Shape shape1 = shapeFactory.createShape(ShapeFactory.CIRCLE);
            shape1.draw();

            Shape shape2 = shapeFactory.createShape(ShapeFactory.SQUARE);
            shape2.draw();

            Shape shape3 = shapeFactory.createShape(ShapeFactory.RECTANGLE);
            shape3.draw();

            Shape shape4 = shapeFactory.createShape(ShapeFactory.CIRCLE);
            shape4.draw();

            Shape shape5 = shapeFactory.createShape(ShapeFactory.SQUARE);
            shape5.draw();

           
            Shape shape6 = shapeFactory.createShape(ShapeFactory.RECTANGLE);
            shape6.draw();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
