import java.util.Random;
public class Cloudy extends FlyWeightObserver {
    public String state;

    public Cloudy(){
        System.out.println("Original FlyWeight Bulb Object stored in HashMap");
    }
    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void update(String state) {
        setState(state);
        if (state == "Cloudy") {
            System.out.println(">> Cloudy Mode Starts...");
            System.out.println("Farm Device for cloudy weather starts working");
            System.out.println("Decrease Cooling system power under temp. control");
            selectBulb();
            endSequence();
        }
    }

    public void selectBulb() {
        Random rd = new Random();
        int bulbN = rd.nextInt(super.bulbs.size()) + 1;
        String color = super.bulbs.get(bulbN);
        System.out.println("->Turn on Bulb " + bulbN + " for " + color + " Specturm");
    }

    @Override
    public void endSequence() {
        System.out.println("=================");
    }

}
