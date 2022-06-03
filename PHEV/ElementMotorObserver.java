public class ElementMotorObserver implements Observer {

    @Override
    public void update() {
        System.out.print("Electric Motor Log/Observer: ");
        switch (ElementEngineStatus.getStatusInt()) {
            case 0:
                System.out.println("Motor Status OK");
                break;
            case 1:
                System.out.println("Repairing Reduced Motor Power status");
                break;
            case 2:
                System.out.println("Repairing Irregular Motor Power Warning");
                break;
            case 3:
                System.out.println("Repairing Car Vibration with Motor");
                break;
            default:
                //
        }

    }
}
