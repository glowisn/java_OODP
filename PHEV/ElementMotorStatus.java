import java.util.Random;

public class ElementMotorStatus {
    private static ElementMotorStatus theObject;
    private static int status;
    private ElementMotorStatus(){
        Random random = new Random();
        int num = random.nextInt(4);
        ElementMotorStatus.status = num;
    }
    public static ElementMotorStatus createEngineStatus(){
        if (theObject == null)
            theObject = new ElementMotorStatus();
        return theObject;
    }
    public static int getStatus(){
        return status;
    }
    public String toString(){
        return "[Status id=" + status + "]";
    }
}
