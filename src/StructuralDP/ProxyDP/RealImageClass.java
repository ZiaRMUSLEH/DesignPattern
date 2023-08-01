package StructuralDP.ProxyDP;

public class RealImageClass implements ImageGenerator {


    private String fullPath;

    public RealImageClass (String fullPath) {
        this.fullPath = fullPath;
    }

    @Override
    public void showImage () {
        System.out.println("Displaying the image name [........]");
    }

    public void changeImage(){
        System.out.println("Image has been changed");
    }

    public void loadImage(){
        System.out.println("Image is loading");
    }
}
