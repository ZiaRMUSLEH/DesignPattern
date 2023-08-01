package BehavioralDP.MediatorDP;



public class MediatorRunner {
    public static void main(String[] args) {

        // Dispatcher
        MessageDispatcher dispatcher = new MessageDispatcher();


        // Actors / People
        Actor actor1 = new MessageActor("plant.prof",dispatcher);
        Actor actor2 = new MessageActor("animal.prof",dispatcher);
        Actor actor3 = new MessageActor("IT.prof",dispatcher);
        Actor actor4 = new MessageActor("physic.prof",dispatcher);


        // Register the Actors to the Dispatcher
        dispatcher.register("plant",actor1);
        dispatcher.register("animal",actor2);
        dispatcher.register("IT",actor3);
        dispatcher.register("physic",actor4);


        // Sending Questions/Messages
        actor1.sendMessage("IT","How can i reset my computer");
        actor2.sendMessage("animal","How can i feed a dinasor");
        actor3.sendMessage("plant","How can i water my plants");
        actor4.sendMessage("animal","How can i ride horse");


    }
}