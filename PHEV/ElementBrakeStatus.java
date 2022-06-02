public class ElementBrakeStatus {
    private static ElementBrakeStatus theObject;
    private ElementBrakeStatus(){
    }
    public static ElementBrakeStatus createEngineStatus(){
        if (theObject == null)
            theObject = new ElementBrakeStatus();
        return theObject;
    }
}
