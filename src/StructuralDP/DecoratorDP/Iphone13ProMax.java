package StructuralDP.DecoratorDP;

public class IPhone13ProMax extends IPhone13Pro{
    public IPhone13ProMax (IPhone basePhone) {
        super(basePhone);
    }

    @Override
    public String getName () {
        return super.getName()+"Max";
    }

    @Override
    public int cameraCount () {
        return super.cameraCount()+1;
    }

    @Override
    public double getPrice () {
        return super.getPrice()+100;
    }
}
