public class ElementEngineStatus {
    private static ElementEngineStatus theObject;
    private ElementEngineStatus(){
    }
    public static ElementEngineStatus createEngineStatus(){
        if (theObject == null)
            theObject = new ElementEngineStatus();
        return theObject;
    }
}
