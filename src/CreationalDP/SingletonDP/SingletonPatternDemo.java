package CreationalDP.SingletonDP;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //SingletonObject obj1 = new SingletonObject();
        //SingletonObject obj2 = new SingletonObject();

        SingletonObject obj3 = SingletonObject.getInstance();
        System.out.println("Obj3: "+obj3.message);   // Hey there!
        obj3.changeMessage();   // Hey there! UPDATED MESSAGE

        SingletonObject obj4 = SingletonObject.getInstance();
        System.out.println("Obj4: "+obj4.message);   // Hey there! UPDATED MESSAGE





    }
}