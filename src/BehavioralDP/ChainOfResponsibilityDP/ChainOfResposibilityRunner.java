package BehavioralDP.ChainOfResponsibilityDP;

public class ChainOfResposibilityRunner {
    public static void main (String[] args) {

        Approver generalManager = new GeneralManager();

        Approver manager = new Manager(generalManager);

        Approver official = new Official(manager);

        System.out.println("Limits for loan Offers");
        System.out.println("Official: <100\nManager: <500\nGeneral Manager: No Limit");

        System.out.println("Requested Amount: 600");

        official.approveLoan(100);

    }
}
