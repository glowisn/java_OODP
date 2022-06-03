public class ElementEngineObserver implements Observer {

    @Override
    public void update(Visitor v) {
        System.out.print("Gasoline Engine Log/Observer: ");
        // SystemComponentCheck
        if (v.getType() == 1) {
            switch (ElementEngineStatus.getStatusInt()) {
                case 0:
                    System.out.println("Engine Running OK");
                    break;
                case 1:
                    System.out.println("Suggesting Oil Change");
                    break;
                case 2:
                    System.out.println("Suggesting Spark Plug Checking");
                    break;
                case 3:
                    System.out.println("Suggesting Battery Power Checking");
                    break;
                default:
                    //
            }
        }
        // SelfRepairing
        if (v.getType() == 2) {
            switch (ElementEngineStatus.getStatusInt()) {
                case 0:
                    System.out.println("Engine Status Good");
                    break;
                case 1:
                    System.out.println("Repairing Engine Oil Warning");
                    break;
                case 2:
                    System.out.println("Repairing Irregular Engine Power Warning");
                    break;
                case 3:
                    System.out.println("Repairing Engine Power Reduced Warning");
                    break;
                default:
                    //
            }
        }
        // SoftwareControl
        if (v.getType() == 3) {
            switch (ElementEngineStatus.getStatusInt()) {
                case 0:
                    System.out.println("Keep Curren SW Monitoring Module for Engine");
                    break;
                case 1:
                    System.out.println("Resetting Oil Level for engine oil warning");
                    break;
                case 2:
                    System.out.println("Software Resetting with Power Monitoring Module for Irregular Engine Power Warning");
                    break;
                case 3:
                    System.out.println("Resetting Minimum Power Level for Engine Power Reduced Warning");
                    break;
                default:
                    //
            }
        }
    }
}