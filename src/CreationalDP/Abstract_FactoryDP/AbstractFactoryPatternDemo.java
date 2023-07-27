package CreationalDP.Abstract_FactoryDP;

public class AbstractFactoryPatternDemo {

    public static void main (String[] args) {

        AbstractFactory factory1 = FactoryProducer.getFactory("shape");
        Shape shape = factory1.getShape("circle");
        shape.draw();

        AbstractFactory factory2 = FactoryProducer.getFactory("color");
        Color color = factory2.getColor("red");
        color.fill();

    }

}
