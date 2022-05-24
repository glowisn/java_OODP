import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract class PrototypeObserver implements Observer, Cloneable {
    Random rd = new Random();
    Battery bat = new Battery();

    public void batteryClone(String s) {
        try {
            Battery newBattery = (Battery) bat.clone();
            newBattery.sets(s);
            newBattery.prints();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    List<String> batterys = new ArrayList<String>();

    public void bhashMake() {
        batterys.add("B");
        System.out.println("Type B => Type B Battery");
        batterys.add("A");
        System.out.println("Type A => Type A Battery");
        System.out.println("\n");

    }

}
