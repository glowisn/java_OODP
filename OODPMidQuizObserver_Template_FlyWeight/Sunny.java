import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sunny extends PrototypeObserver {
    private String state;

    public Sunny() {
        System.out.println("Original Prototype Battery Objects stored in HashMap");
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

    public void update(String state) {
        setState(state);
        if (state == "Sunny") {
            System.out.println(">>Sunny Mode Starts...");
            System.out.println("Farm Devices for sunny weather starts working");
            System.out.println("Adjust solar panels for maximum battery charging");
            // TODO:
            Random rd = new Random();
            int bc = rd.nextInt(3);
            if(bc == 0){
                //Battery Full. Do nothing.
            }
            if(bc != 0){
                System.out.println("-->One Battery Cell is replaced with a Prototype...");
            }
            if(bc == 1){
                batteryClone(super.batterys.get(0));
            }
            if(bc == 2){
                batteryClone(super.batterys.get(1));
            }
            System.out.println("Turn off heating bulbs");
            System.out.println("Start Cooling System");

            endSequence();
        }
    }

    public void endSequence() {
        System.out.println("=================");
    }
}
