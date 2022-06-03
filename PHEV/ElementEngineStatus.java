import java.util.Random;

public class ElementEngineStatus {
    private static ElementEngineStatus theObject;
    private static int status;

    private ElementEngineStatus(){
        Random random = new Random();
        int num = random.nextInt(4);
        ElementEngineStatus.status = num;
    }
    public static ElementEngineStatus createEngineStatus(){
        if (theObject == null)
            theObject = new ElementEngineStatus();
        return theObject;
    }
    public String toString(){
        return "[Status id=" + status + "]";
    }

    public static int getStatusInt(){
        return ElementEngineStatus.status;
    }
}
