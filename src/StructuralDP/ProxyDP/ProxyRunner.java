package StructuralDP.ProxyDP;

public class ProxyRunner {
    public static void main (String[] args) {

ImageGenerator proxy = new ProxyImageClass("c/:12213");
proxy.showImage();

        System.out.println("\n************************\n");

RealImageClass real = new RealImageClass("c/:654646");
real.showImage();
real.changeImage();
real.loadImage();


    }
}
