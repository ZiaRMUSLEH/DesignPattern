package StructuralDP.DecoratorDP;

public class IPhoneDecorator implements Phone{

    protected Phone basicPhone;

    public IPhoneDecorator (IPhone basePhone){
        this.basicPhone = basePhone;
    }


    @Override
    public String getName () {
        return basicPhone.getName();
    }

    @Override
    public int cameraCount () {
        return basicPhone.cameraCount();
    }

    @Override
    public double getPrice () {
        return basicPhone.getPrice();
    }
}
