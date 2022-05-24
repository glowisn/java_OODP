import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Smart Farm Working\n");

        Observable observable = new Observable();
        LogSubject subject = new LogSubject();

        PrototypeObserver sunny = new Sunny();
        sunny.bhashMake();
        FlyWeightObserver cloudy = new Cloudy();
        cloudy.bulbsMake();
        Observer rainy = new Rainy();
        subject.attach(sunny);
        subject.attach(cloudy);
        subject.attach(rainy);

        for (int i = 0; i < 6; i++) {
            subject.setState(observable.getState());            
        }

    }
}
