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

    public static String getStatus(){
        switch(ElementBrakeStatus.status){
            case 0:
                return "";
            case 1:
                return "Use an extra generator system for Regerative Brake System";
            case 2:
                return "Apply Oil to Brake Generator Contact Point of Regernerative Brake System";
            case 3:
                return "Monitoring Brake and Generator Gear of Regerative Brake System";
            default:
                return "    ---Error: Unreachble Code---    ";
        }
    }
}
