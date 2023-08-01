package StructuralDP.ProxyDP;

public class ProxyImageClass implements ImageGenerator{


    private String fullPath;

    //Constructor
    public ProxyImageClass (String fullPath) {
        this.fullPath = fullPath;
    }

    private RealImageClass realImageClass;

    @Override
    public void showImage () {
        if(realImageClass==null){
        realImageClass = new RealImageClass(fullPath);
        } realImageClass.showImage();
    }
}
