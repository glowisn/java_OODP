public class ElementBrakeObserver implements Observer {

    @Override
    public void update(Visitor v) {
        System.out.print("Regnerative Brake System Log/Observer: ");
        //SystemComponentCheck
        if (v.getType() == 1) 
        {
            switch (ElementBrakeStatus.getStatusInt()) {
                case 0:
                    System.out.println("Regen. Brake Working OK");
                    break;
                case 1:
                    System.out.println("Suggesting Generator Coil Damage Checking");
                    break;
                case 2:
                    System.out.println("Suggesting Brake Generator Contact Checking");
                    break;
                case 3:
                    System.out.println("Suggesting Brake and Generator Gear Checking");
                    break;
                default:
                    //
            }
        }
        //SelfRepairing
        if(v.getType() == 2)
        {
            switch (ElementBrakeStatus.getStatusInt()) {
                case 0:
                    System.out.println("Regnerative Brake System OK");
                    break;
                case 1:
                    System.out.println("Repairing Generator Coil Damage for Regnerative Brake System");
                    break;
                case 2:
                    System.out.println("Repairing No Electricity Generated for Regnerative Brake System");
                    break;
                case 3:
                    System.out.println("Repairing Abonormal Speed Decrease with Regnerative Brake System");
                    break;
                default:
                    //
            }
        }
        //SoftwareControl
        if(v.getType() == 3)
        {
            switch (ElementBrakeStatus.getStatusInt()) {
                case 0:
                    System.out.println("Keep Curren SW Monitoring Module for Regenerative Brake System");
                    break;
                case 1:
                    System.out.println("Resetting Coil Damage Monitoring SW for Regenerative Brake System");
                    break;
                case 2:
                    System.out.println("Resetting Electricity Monitoring SW for Regenerative Brake System");
                    break;
                case 3:
                    System.out.println("Resetting Speed Monitoring SW with Regenerative Brake System");
                    break;
                default:
                    //
            }
        }
    }

}
