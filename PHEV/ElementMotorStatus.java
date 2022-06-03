import java.util.Random;

public class ElementMotorStatus {
    private static ElementMotorStatus theObject;
    private static int status;
    private ElementMotorStatus(Random random){

    }
    public static ElementMotorStatus createEngineStatus(Random random){
        if (theObject == null)
            theObject = new ElementMotorStatus(random);
        return theObject;
    }
    public static int getStatus(){
        return status;
    }
    public String toString(){
        return "[Status id=" + status + "]";
    }
}
