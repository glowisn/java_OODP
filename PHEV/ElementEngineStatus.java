public class ElementEngineStatus {
    private static ElementEngineStatus theObject;
    private static int status;

    private ElementEngineStatus(){
        this.status = 77;
    }
    public static ElementEngineStatus createEngineStatus(){
        if (theObject == null)
            theObject = new ElementEngineStatus();
        return theObject;
    }
    public static int getStatus(){
        return status;
    }
    public String toString(){
        return "[Status id=" + status + "]";
    }
}
