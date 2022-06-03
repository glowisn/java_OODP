public class ElementBrakeObserver implements Observer {

    @Override
    public void update(VisitorSystemComponentChecking systemComponentChecking) {
        System.out.print("Regnerative Brake System Log/Observer: ");
        switch(ElementEngineStatus.getStatusInt()){
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

    @Override
    public void update(VisitorSoftwareControl softwareControl) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(VisitorSelfRepairing selfRepairing) {
        // TODO Auto-generated method stub
        
    }
    
}
