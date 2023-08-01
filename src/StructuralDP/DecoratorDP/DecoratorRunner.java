package StructuralDP.DecoratorDP;

public class DecoratorRunner {
    public static void main (String[] args) {

        IPhone iphone1 = new IPhone();
        Phone iphone = new IPhone13(iphone1);
        System.out.println("Name "+iphone.getName());
        System.out.println("CameraCount "+iphone.cameraCount());
        System.out.println("Price "+iphone.getPrice());


    }
}
