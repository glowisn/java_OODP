import java.util.HashMap;
import java.util.Map;

abstract class FlyWeightObserver implements Observer{
    protected Map<Integer, String> bulbs = new HashMap<Integer, String>();
    
    void makeBulb(int num, String color){
        bulbs.put(num, color);
        System.out.println("Bulb " + num + " => " + "Bulb " + num + " for " + color + " Specturm");
    }

    void bulbsMake(){
        makeBulb(2, "Green");
        makeBulb(1, "Blue");
        makeBulb(4, "White");
        makeBulb(3, "Yellow");
        System.out.println("\n");
    }

}