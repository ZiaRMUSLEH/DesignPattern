package CreationalDP.FactoryDP;

public class FactoryPatternDemo {
    public static void main(String[] args) {

        /*
        //Circle circle = new Circle();
        Shape circle = new Circle();
        circle.draw();

        Shape triangle = new Triangle();
        triangle.draw();

        Shape square = new Square();
        square.draw();
        */


        // FactoryDP
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Circle");
        Shape shape2 = shapeFactory.getShape("Triangle");
        Shape shape3 = shapeFactory.getShape("Square");

        shape1.draw();
        shape2.draw();
        shape3.draw();


    }
}