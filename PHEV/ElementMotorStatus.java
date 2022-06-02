public class ElementMotorStatus {
    private static ElementMotorStatus theObject;
    private ElementMotorStatus(){
    }
    public static ElementMotorStatus createEngineStatus(){
        if (theObject == null)
            theObject = new ElementMotorStatus();
        return theObject;
    }
}
