import java.util.Random;

public class ElementBrakeStatus {
    private static ElementBrakeStatus theObject;
    private static int status;
    private ElementBrakeStatus(){
        Random random = new Random();
        int num = random.nextInt(4);
        ElementBrakeStatus.status = num;
    }
    public static ElementBrakeStatus createBrakeStatus(){
        if (theObject == null)
            theObject = new ElementBrakeStatus();
        return theObject;
    }

    public static int getStatusInt(){
        return ElementBrakeStatus.status;
    }
}
