public class ElementMotorObserver implements Observer {

    @Override
    public void update(Visitor v) {
        System.out.print("Electric Motor Log/Observer: ");
        //SystemComponentCheck
        if (v.getType() == 1) 
        {
            switch (ElementMotorStatus.getStatusInt()) {
                case 0:
                    System.out.println("Motor Running OK");
                    break;
                case 1:
                    System.out.println("Suggesting Motor Battery Power Checking");
                    break;
                case 2:
                    System.out.println("Suggesting Motor Brush Contact");
                    break;
                case 3:
                    System.out.println("Suggesting Motor Mounting Bolt Checking");
                    break;
                default:
                    //
            }
        }
        //SelfRepairing
        if(v.getType() == 2)
        {
            switch (ElementMotorStatus.getStatusInt()) {
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
        //SoftwareControl
        if(v.getType() == 3)
        {
            switch (ElementMotorStatus.getStatusInt()) {
                case 0:
                    System.out.println("Keep Curren SW Monitoring Module for Motor");
                    break;
                case 1:
                    System.out.println("Resetting the SW for Reduced Motor Power Monitoring");
                    break;
                case 2:
                    System.out.println("Software Resetting with Motor Power Monitoring Module for Irregular Motor Power Warning");
                    break;
                case 3:
                    System.out.println("Resetting the Monitoring SW for Car Vibration with Motor Action");
                    break;
                default:
                    //
            }
        }
    }
}
