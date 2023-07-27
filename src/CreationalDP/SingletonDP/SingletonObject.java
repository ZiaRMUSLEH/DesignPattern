package CreationalDP.SingletonDP;

public class SingletonObject {

    String message = "Hey there!";

    private static SingletonObject instance = new SingletonObject();

    // Default Constructor
    /*
    public SingletonObject(){

    }
    */
    private SingletonObject(){

    }

    public static SingletonObject getInstance() {
        /*
        if (instance == null)
            instance = new SingletonObject();
        */
        return instance;
    }

    public void changeMessage(){
        this.message = this.message +" UPDATED MESSAGE";
        System.out.println("Done");
    }
}