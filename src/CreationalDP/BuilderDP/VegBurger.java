package CreationalDP.BuilderDP;

public class VegBurger extends Burger{
    @Override
    public String name () {
        return "Veg Burger";
    }

    @Override
    public double price () {
        return 25.0;
    }
}
