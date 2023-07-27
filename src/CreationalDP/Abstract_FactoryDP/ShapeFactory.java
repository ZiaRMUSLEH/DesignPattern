package CreationalDP.Abstract_FactoryDP;

import CreationalDP.Abstract_FactoryDP.AbstractFactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shapeType){
        if (shapeType.equalsIgnoreCase("Circle"))
            return new Circle();
        else if (shapeType.equalsIgnoreCase("Triangle"))
            return new Triangle();
        else if (shapeType.equalsIgnoreCase("Square"))
            return new Square();
        else
            return null;
    }

}