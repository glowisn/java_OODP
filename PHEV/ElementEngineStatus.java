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

    public static String getStatus(){
        switch(ElementEngineStatus.status){
            case 0:
                return "";
            case 1:
                return "Engine Oil To Be Checked on Gasoline Engine";
            case 2:
                return "Irregular Engine Power with Gasoline Engine";
            case 3:
                return "Engine Power Reduced with Gasoline Engine";
            default:
                return "    ---Error: Unreachble Code---    ";
        }
    }
}
