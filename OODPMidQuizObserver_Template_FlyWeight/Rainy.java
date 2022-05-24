public class Rainy implements Observer {
    public String state;

    public void update(String state) {
        setState(state);
        if (state == "Rainy") {
            System.out.println(">> Rainy Mode Starts...");
            System.out.println("Device for rainy weather starts working");
            System.out.println("Stop Cooling system under temp. control");
            System.out.println("Supply system power from charged batteries");
            System.out.println("Turn on all heating bulbs to keep constant temperature");
            endSequence();
        }
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
    public void endSequence() {
            System.out.println("=================");   
    }
}
